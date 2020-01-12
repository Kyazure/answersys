package com.yeqi.answersys.choiceans.entity;

public class ChoiceAnswer extends ChoiceAnswerKey {
    private String user_answer;

    public String getUser_answer() {
        return user_answer;
    }

    public void setUser_answer(String user_answer) {
        this.user_answer = user_answer == null ? null : user_answer.trim();
    }
}