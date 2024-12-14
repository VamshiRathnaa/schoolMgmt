package com.school.exception;

/**
 * Custom exception class for school-specific errors
 */
public class SchoolException extends Exception {
    public SchoolException(String message) {
        super(message);
    }

    public SchoolException(String message, Throwable cause) {
        super(message, cause);
    }
}