package com.example.springjparelationshipsexample.controller;

import com.example.springjparelationshipsexample.entity.Subject;
import com.example.springjparelationshipsexample.service.subject.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    @GetMapping
    List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }

    @PostMapping
    Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    Subject addStudentToSubject(@PathVariable Long subjectId, @PathVariable Long studentId) {
        return subjectService.addStudentToSubject(subjectId, studentId);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    Subject addTeacherToSubject(@PathVariable Long subjectId, @PathVariable Long teacherId) {
        return subjectService.addTeacherToSubject(subjectId, teacherId);
    }
}