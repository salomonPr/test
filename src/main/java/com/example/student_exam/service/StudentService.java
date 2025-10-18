package com.example.student_exam.service;

import com.example.student_exam.entity.Student;
import com.example.student_exam.exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();
    private Long nextId = 1L;

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(Long id) {
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + id));
    }

    public Student addStudent(Student student) {
        student.setId(nextId++);
        students.add(student);
        return student;
    }
}

