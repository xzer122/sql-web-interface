package com.example.sqlite_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question_text")
    private String question;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public Question() {
    }

    public Question(String question, Section section) {
        this.question = question;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Section getSection() {
        return section;
    }
}
