package com.school.model;

// Base class demonstrating inheritance
public abstract class Person {
    protected String id;
    protected String name;
    protected String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getRole();

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}