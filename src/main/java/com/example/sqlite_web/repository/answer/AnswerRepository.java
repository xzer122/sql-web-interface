package com.example.sqlite_web.repository.answer;

import com.example.sqlite_web.model.Answer;

public interface AnswerRepository {
    Answer save(Answer answer);

    Answer delete(Answer answer);

    Answer get(long id);
}
