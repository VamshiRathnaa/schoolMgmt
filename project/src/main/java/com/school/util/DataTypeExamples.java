package com.school.util;

/**
 * Class demonstrating Java data types, variables, and operators
 */
public class DataTypeExamples {
    // Primitive data types
    private byte byteVar = 127;
    private short shortVar = 32767;
    private int intVar = 2147483647;
    private long longVar = 9223372036854775807L;
    private float floatVar = 3.14f;
    private double doubleVar = 3.14159265359;
    private boolean booleanVar = true;
    private char charVar = 'A';

    // Wrapper classes
    private Integer wrappedInt = Integer.valueOf(100);
    private Double wrappedDouble = Double.valueOf(3.14);
    private Boolean wrappedBoolean = Boolean.TRUE;

    public void demonstrateTypeCasting() {
        // Widening casting (automatic)
        int widened = byteVar;
        long widenedMore = intVar;
        
        // Narrowing casting (manual)
        int narrowed = (int) longVar;
        byte narrowedMore = (byte) intVar;
    }

    public void demonstrateOperators() {
        // Arithmetic operators
        int sum = 10 + 5;
        int difference = 10 - 5;
        int product = 10 * 5;
        int quotient = 10 / 5;
        int remainder = 10 % 3;

        // Comparison operators
        boolean isEqual = (sum == 15);
        boolean isNotEqual = (sum != 10);
        boolean isGreater = (sum > 10);
        boolean isLess = (sum < 20);

        // Logical operators
        boolean andResult = isEqual && isGreater;
        boolean orResult = isEqual || isLess;
        boolean notResult = !isEqual;

        // Ternary operator
        String result = (sum > 10) ? "Greater than 10" : "Less than or equal to 10";
    }
}