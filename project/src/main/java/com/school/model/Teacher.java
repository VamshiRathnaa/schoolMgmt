package com.school.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String subject;
    private List<String> classes;

    public Teacher(String id, String name, String email, String subject) {
        super(id, name, email);
        this.subject = subject;
        this.classes = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    public String getSubject() { return subject; }
    public List<String> getClasses() { return classes; }
    public void addClass(String className) { classes.add(className); }
}