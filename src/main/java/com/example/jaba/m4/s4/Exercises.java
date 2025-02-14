/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s4;

/**
 * Branch in code execution switching on a condition
 */
public class Exercises {
    public static void main(String[] args) {
        int a = 42;
        int b = 7;

        char op = '+';

        if (op == '+') {
            System.out.println("The sum of a and b is " + (a + b));
        }

        // TODO: switch on op for '+', '-', '/', '*' to operate on a and b
        System.out.println("The [sum/subtraction/division/product] of a and b is ... ");

        // TODO: same, but use an enum for the operation instead of a char

    }
}
