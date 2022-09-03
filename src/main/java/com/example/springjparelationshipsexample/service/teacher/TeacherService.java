package com.example.springjparelationshipsexample.service.teacher;

import com.example.springjparelationshipsexample.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {

    public List<Teacher> getTeachers();

    public Teacher addTeacher(Teacher teacher);

}
