package ru.otus.springboot.lesson5.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
@RequiredArgsConstructor
public class Answer {

    private final Map<Question, String> answers = new HashMap<>();

    public String getAnswer(Question question) {
        return answers.get(question);
    }

    public void putAnswer(Question question, String answer) {
        answers.put(question, answer.trim());
    }


}
