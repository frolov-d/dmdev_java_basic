package com.jsd.task;

/**
 * 3. В 1626 году индейцы продали Манхэттэн за 24$.
 *  Написать программу, которая высчитает сумму,
 *  получившуюся бы в текущем году, если бы индейцы положили эти
 *  деньги в банк пол 5% годовых.
 */

public class Task7 {

    public static void main(String[] args) {
        double sourceSum = 24;
        double result = sum(sourceSum);
        System.out.println(result);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2022; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);
        }

        return result;
    }
}
