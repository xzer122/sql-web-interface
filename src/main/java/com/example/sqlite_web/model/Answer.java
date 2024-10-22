package com.example.sqlite_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "answers")
public class Answer extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "answer_text")
    private String answer;

    @Column(name = "is_correct")
    private boolean correct;

    public Answer() {
        super();
    }

    public Answer(Integer id, String answer, boolean correct, Question question) {
        super(id, answer);
        this.question = question;
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }
}
