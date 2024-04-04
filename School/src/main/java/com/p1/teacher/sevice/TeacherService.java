package com.p1.teacher.sevice;

import com.example.SchoolManagementSchool.teacher.model.Teacher;
import com.example.SchoolManagementSchool.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public Teacher saveOrUpdateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }
}
