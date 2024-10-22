package com.example.sqlite_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String name;

    public Course(Integer id, String name) {
        super(id, name);
    }

    public Course() {
        super();
    }

    public String getName() {
        return name;
    }
}
