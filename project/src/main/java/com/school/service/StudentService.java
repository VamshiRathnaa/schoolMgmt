package com.school.service;

import com.school.model.Student;
import com.school.repository.StudentRepository;

// Service class demonstrating Dependency Injection
public class StudentService {
    private final StudentRepository repository;
    private final GradeCalculator gradeCalculator;

    // Constructor injection - Dependency Inversion Principle
    public StudentService(StudentRepository repository, GradeCalculator gradeCalculator) {
        this.repository = repository;
        this.gradeCalculator = gradeCalculator;
    }

    public void enrollStudent(Student student) {
        repository.addStudent(student);
    }

    public void updateStudentGrades(String studentId, double[] scores) {
        Student student = repository.getStudent(studentId);
        if (student != null) {
            double gpa = gradeCalculator.calculateGrade(scores);
            student.setGpa(gpa);
            repository.updateStudent(student);
        }
    }
}