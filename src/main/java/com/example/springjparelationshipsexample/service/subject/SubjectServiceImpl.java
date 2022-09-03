package com.example.springjparelationshipsexample.service.subject;

import com.example.springjparelationshipsexample.entity.Student;
import com.example.springjparelationshipsexample.entity.Subject;
import com.example.springjparelationshipsexample.entity.Teacher;
import com.example.springjparelationshipsexample.repository.StudentRepository;
import com.example.springjparelationshipsexample.repository.SubjectRepository;
import com.example.springjparelationshipsexample.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    private final StudentRepository studentRepository;

    private final TeacherRepository teacherRepository;

    @Override
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject addStudentToSubject(Long subjectId, Long studentId) {
        Subject subject = subjectRepository.findById(subjectId).orElse(null);
        Student student = studentRepository.findById(studentId).orElse(null);
        subject.enrolledStudent(student);
        return subjectRepository.save(subject);
    }

    @Override
    public Subject addTeacherToSubject(Long subjectId, Long teacherId) {
        Subject subject = subjectRepository.findById(subjectId).orElse(null);
        Teacher teacher = teacherRepository.findById(teacherId).orElse(null);
        subject.setTeacher(teacher);
        return subjectRepository.save(subject);
    }

}
