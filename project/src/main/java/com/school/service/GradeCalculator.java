package com.school.service;

// Interface segregation principle - specific interface for grade calculation
public interface GradeCalculator {
    double calculateGrade(double[] scores);
}