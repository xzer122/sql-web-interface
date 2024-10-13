package com.example.sqlite_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "course_sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "section_name")
    private String sectionName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Section() {
    }

    public Section(String sectionName, Course course) {
        this.sectionName = sectionName;
        this.course = course;
    }
}
