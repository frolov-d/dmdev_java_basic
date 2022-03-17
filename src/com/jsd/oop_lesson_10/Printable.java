package com.jsd.oop_lesson_10;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(generateRandom());
        print();
    }

    void print();

    private int generateRandom() {
        return RANDOM.nextInt();
    }
}
