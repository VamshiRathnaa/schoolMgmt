package com.school.util;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Class demonstrating Java API features including String manipulation,
 * Date/Time API, ArrayList, and Lambda expressions
 */
public class JavaAPIExamples {
    public void demonstrateStringManipulation() {
        // StringBuilder example
        StringBuilder sb = new StringBuilder();
        sb.append("Hello")
          .append(" ")
          .append("World")
          .append("!");
        String result = sb.toString();

        // String manipulation
        String str = "Hello World";
        String upper = str.toUpperCase();
        String sub = str.substring(0, 5);
        boolean startsWith = str.startsWith("Hello");
        String[] parts = str.split(" ");
    }

    public void demonstrateDateTimeAPI() {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();

        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);

        // Period calculation
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        Period age = Period.between(birthDate, today);
        int years = age.getYears();
    }

    public void demonstrateArrayList() {
        // ArrayList with generics
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        // Lambda expression with forEach
        list.forEach(item -> System.out.println(item));

        // Lambda with Predicate
        Predicate<String> startsWithF = str -> str.startsWith("F");
        boolean hasItemStartingWithF = list.stream()
                                         .anyMatch(startsWithF);
    }
}