package com.example.pollingapp.dto;

import java.util.List;

public class PollCreationDto {
    private String title;
    private List<QuestionCreationDto> questions;

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<QuestionCreationDto> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionCreationDto> questions) {
        this.questions = questions;
    }
}