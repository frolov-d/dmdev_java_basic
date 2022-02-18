package com.jsd.task;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task6 {

    public static void main(String[] args) {
        int value = 12345;
        int sum = sum(value);
        System.out.println(sum);
        int sum2 = sumFor(value);
        System.out.println(sum2);
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }

        return result;
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }

        return result;
    }
}
