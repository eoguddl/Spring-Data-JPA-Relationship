package com.example.springjparelationshipsexample.service.subject;

import com.example.springjparelationshipsexample.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService {

    public List<Subject> getSubjects();

    public Subject createSubject(Subject subject);

    public Subject addStudentToSubject(Long subjectId, Long studentId);

    public Subject addTeacherToSubject(Long subjectId, Long teacherId);

}
