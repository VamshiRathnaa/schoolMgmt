package com.school.util;

import java.util.Arrays;

/**
 * Class demonstrating array operations and loop constructs
 */
public class ArrayExamples {
    // One-dimensional array
    private int[] numbers = new int[5];
    
    // Multi-dimensional array
    private int[][] matrix = new int[3][3];

    public void demonstrateArrayOperations() {
        // Initialize one-dimensional array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        // Enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // Initialize multi-dimensional array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }

        // While loop example
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }

        // Do-while loop example
        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);

        // Break and continue example
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue; // Skip 5
            if (i == 8) break;    // Stop at 8
            System.out.println(i);
        }
    }
}