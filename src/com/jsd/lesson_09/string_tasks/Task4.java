package com.jsd.lesson_09.string_tasks;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */
public class Task4 {

    public static void main(String[] args) {
        String value = "asdasd...,!asdas.,?asd!asda";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        var result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
