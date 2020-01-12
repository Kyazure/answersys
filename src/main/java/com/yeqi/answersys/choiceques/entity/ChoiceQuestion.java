package com.yeqi.answersys.choiceques.entity;


public class ChoiceQuestion {
    private Integer id;

    private Integer score;

    private String right_choice;

    private String question;

    private String choice_a;

    private String choice_b;

    private String choice_c;

    private String choice_d;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRight_choice() {
        return right_choice;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoice_a() {
        return choice_a;
    }

    public void setChoice_a(String choice_a) {
        this.choice_a = choice_a;
    }

    public String getChoice_b() {
        return choice_b;
    }

    public void setChoice_b(String choice_b) {
        this.choice_b = choice_b;
    }

    public String getChoice_c() {
        return choice_c;
    }

    public void setChoice_c(String choice_c) {
        this.choice_c = choice_c;
    }

    public String getChoice_d() {
        return choice_d;
    }

    public void setChoice_d(String choice_d) {
        this.choice_d = choice_d;
    }

    public void setRight_choice(String right_choice) {
        this.right_choice = right_choice == null ? null : right_choice.trim();
    }

    @Override
    public String toString() {
        return "ChoiceQuestion{" +
                "id=" + id +
                ", score=" + score +
                ", right_choice='" + right_choice + '\'' +
                ", question='" + question + '\'' +
                ", choice_a='" + choice_a + '\'' +
                ", choice_b='" + choice_b + '\'' +
                ", choice_c='" + choice_c + '\'' +
                ", choice_d='" + choice_d + '\'' +
                '}';
    }
}