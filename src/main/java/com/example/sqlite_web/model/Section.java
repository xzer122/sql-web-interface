package com.example.sqlite_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "course_sections")
public class Section extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "section_name")
    private String sectionName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Section() {
        super();
    }

    public Section(int id, String sectionName, Course course) {
        super(id, sectionName);
        this.course = course;
    }
}
