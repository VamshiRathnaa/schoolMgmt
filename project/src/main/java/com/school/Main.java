package com.school;

import com.school.model.*;
import com.school.repository.*;
import com.school.service.*;
import com.school.util.*;

public class Main {
    public static void main(String[] args) {
        // Original code remains the same
        StudentRepository repository = new InMemoryStudentRepository();
        GradeCalculator gradeCalculator = new StandardGradeCalculator();
        StudentService studentService = new StudentService(repository, gradeCalculator);

        // Create and enroll a student
        Student student = new Student("1", "John Doe", "john@example.com", "10th");
        studentService.enrollStudent(student);

        // Demonstrate new functionality
        DataTypeExamples dataTypes = new DataTypeExamples();
        dataTypes.demonstrateTypeCasting();
        dataTypes.demonstrateOperators();

        ArrayExamples arrays = new ArrayExamples();
        arrays.demonstrateArrayOperations();

        ExceptionHandlingExample exceptions = new ExceptionHandlingExample();
        exceptions.demonstrateExceptionHandling();

        JavaAPIExamples apiExamples = new JavaAPIExamples();
        apiExamples.demonstrateStringManipulation();
        apiExamples.demonstrateDateTimeAPI();
        apiExamples.demonstrateArrayList();

        System.out.println("All demonstrations completed successfully!");
    }
}