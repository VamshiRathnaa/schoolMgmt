package com.school.util;

import com.school.exception.SchoolException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Class demonstrating exception handling
 */
public class ExceptionHandlingExample {
    public void demonstrateExceptionHandling() {
        try {
            // Array index out of bounds
            int[] arr = new int[5];
            arr[10] = 50;  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds: " + e.getMessage());
        }

        try {
            // Multiple catch blocks
            Object obj = null;
            obj.toString();  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.err.println("Null pointer: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Generic error: " + e.getMessage());
        } finally {
            System.out.println("This always executes");
        }
    }

    // Method that throws checked exception
    public void readStudentData() throws SchoolException {
        throw new SchoolException("Error reading student data");
    }

    // Method demonstrating try-with-resources
    public void demonstrateTryWithResources() {
        try {
            readStudentData();
        } catch (SchoolException e) {
            System.err.println("School error: " + e.getMessage());
        }
    }
}