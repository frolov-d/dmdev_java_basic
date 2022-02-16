package com.jsd.task;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и опеределяет, является ли этот год високосным.
 * Год считается високосным, если он делится без остатся на 4. Однако, если год также делится на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400.
 */

public class Task4 {

    public static void main(String[] args) {
        int year = 2000;
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
/*
        if (result) {
            return true;
        } else {
            return false;
        }
*/
    }
}
