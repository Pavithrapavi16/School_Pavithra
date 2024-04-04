package com.p1.teacher.model;


import com.example.SchoolManagementSchool.subject.model.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dateOfBirth;
    private String gender;
    private String contactInformation;
    private String address;

    @ManyToMany(mappedBy = "teachers")
    private Set<Subject> subjects = new HashSet<>();

    // Constructors, getters, and setters
}
