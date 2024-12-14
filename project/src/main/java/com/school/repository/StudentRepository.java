package com.school.repository;

import com.school.model.Student;
import java.util.List;

// Interface for data access - Dependency Inversion Principle
public interface StudentRepository {
    void addStudent(Student student);
    Student getStudent(String id);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(String id);
}