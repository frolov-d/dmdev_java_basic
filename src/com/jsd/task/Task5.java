package com.jsd.task;

/**
 * 1. Написать программу высчитывающую факториал введённого целого числа.
 */

public class Task5 {

    public static void main(String[] args) {
        int value = 3;
        var result = factorial(value);
        var result2 = factorialWhile(value);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }

        return result;
    }
}
