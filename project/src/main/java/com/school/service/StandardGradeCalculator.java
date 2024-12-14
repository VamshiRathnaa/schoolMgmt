package com.school.service;

public class StandardGradeCalculator implements GradeCalculator {
    @Override
    public double calculateGrade(double[] scores) {
        if (scores == null || scores.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}