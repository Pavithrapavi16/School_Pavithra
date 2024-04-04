package com.p1.subject.model;

import com.example.SchoolManagementSchool.student.model.Student;
import com.example.SchoolManagementSchool.teacher.model.Teacher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "subject_teacher",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )

    private Set<Teacher> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();

    // Constructors, getters, and setters

}


