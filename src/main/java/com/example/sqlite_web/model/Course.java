package com.example.sqlite_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    public Course() {}

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }
}
