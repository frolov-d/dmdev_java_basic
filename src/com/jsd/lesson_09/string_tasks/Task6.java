package com.jsd.lesson_09.string_tasks;

public class Task6 {

    public static void main(String[] args) {
        var startTime = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            value.append(i);
        }
        var endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}
