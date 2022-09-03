package com.example.springjparelationshipsexample.controller;

import com.example.springjparelationshipsexample.entity.Teacher;
import com.example.springjparelationshipsexample.service.teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    @PostMapping
    Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }
}