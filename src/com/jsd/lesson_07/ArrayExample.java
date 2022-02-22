package com.jsd.lesson_07;

import org.w3c.dom.ls.LSOutput;

public class ArrayExample {

    public static void main(String[] args) {
        int[] values = new int[10];
//        System.out.println(values[5]);
        values[4] = 9;
        values[7] = 98;

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }
    }

    private static void test() {
        int value = 10;
        int[] values = {1, 3, 5, 8, 13};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
