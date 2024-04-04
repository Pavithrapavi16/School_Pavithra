package com.p1.student.model;


import com.example.SchoolManagementSchool.subject.model.Subject;
import com.example.SchoolManagementSchool.teacher.model.Teacher;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dateOfBirth;
    private String gender;
    @ManyToMany(mappedBy = "students")
    private Set<Teacher> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "students")
    private Set<Subject> subjects = new HashSet<>();

    public Student() {
    }

    public Student(Long id, String name, String dateOfBirth, String gender, Set<Teacher> teachers, Set<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.teachers = teachers;
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}



