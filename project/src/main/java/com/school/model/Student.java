package com.school.model;

public class Student extends Person {
    private double gpa;
    private String grade;

    public Student(String id, String name, String email, String grade) {
        super(id, name, email);
        this.grade = grade;
        this.gpa = 0.0;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public String getGrade() { return grade; }
}