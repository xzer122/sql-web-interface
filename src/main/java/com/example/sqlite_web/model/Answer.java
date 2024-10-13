package com.example.sqlite_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question_id")
    private int questionId;

    @Column(name = "answer_text")
    private String answer;

    @Column(name = "is_correct")
    private boolean correct;

    public Answer() {
    }

    public Answer(int questionId, String answer, boolean correct) {
        this.questionId = questionId;
        this.answer = answer;
        this.correct = correct;
    }

    public int getId() {
        return id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }
}
