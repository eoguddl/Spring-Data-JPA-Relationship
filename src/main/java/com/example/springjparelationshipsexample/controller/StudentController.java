package com.example.springjparelationshipsexample.controller;

import com.example.springjparelationshipsexample.entity.Student;
import com.example.springjparelationshipsexample.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}
