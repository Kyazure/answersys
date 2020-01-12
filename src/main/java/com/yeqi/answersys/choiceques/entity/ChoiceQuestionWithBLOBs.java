package com.yeqi.answersys.choiceques.entity;

public class ChoiceQuestionWithBLOBs extends ChoiceQuestion {
    private String question;

    private String choice_a;

    private String choice_b;

    private String choice_c;

    private String choice_d;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getChoice_a() {
        return choice_a;
    }

    public void setChoice_a(String choice_a) {
        this.choice_a = choice_a == null ? null : choice_a.trim();
    }

    public String getChoice_b() {
        return choice_b;
    }

    public void setChoice_b(String choice_b) {
        this.choice_b = choice_b == null ? null : choice_b.trim();
    }

    public String getChoice_c() {
        return choice_c;
    }

    public void setChoice_c(String choice_c) {
        this.choice_c = choice_c == null ? null : choice_c.trim();
    }

    public String getChoice_d() {
        return choice_d;
    }

    public void setChoice_d(String choice_d) {
        this.choice_d = choice_d == null ? null : choice_d.trim();
    }
}