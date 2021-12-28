package com.samsung.model;

public class Student extends Person {
    private String group;
    private int score;

    public Student(String firstName, String secondName, int age, String phone, String group, int score) {
        super(firstName, secondName, age, phone);
        this.score = score;
        this.group = group;
    }

    public Student(String firstName, String secondName, int age, String group, int score) {
        super(firstName, secondName, age);
        this.score = score;
        this.group = group;
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getSecondName() {
        return super.getSecondName();
    }

    public int getAge() {
        return super.getAge();
    }

    public String getPhone() {
        return super.getPhone();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
