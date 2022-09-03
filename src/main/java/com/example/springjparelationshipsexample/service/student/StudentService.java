package com.example.springjparelationshipsexample.service.student;

import com.example.springjparelationshipsexample.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public List<Student> getStudents();

    public Student createStudent(Student student);

}
