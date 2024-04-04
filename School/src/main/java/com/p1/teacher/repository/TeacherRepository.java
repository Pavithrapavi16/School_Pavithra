package com.p1.teacher.repository;

import com.example.SchoolManagementSchool.teacher.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
