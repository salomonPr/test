package com.example.student_exam.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {


    private Long id;
    @NotBlank(message = "required name")
    private String name;
    @NotBlank(message = "required email")
    @Email(message = "invalid email")
    private String email;

}
