package com.example.sqlite_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question_text")
    private String question;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public Question() {
        super();
    }

    public Question(int id, String question, Section section) {
        super(id, question);
        this.section = section;
    }

    public Section getSection() {
        return section;
    }
}
