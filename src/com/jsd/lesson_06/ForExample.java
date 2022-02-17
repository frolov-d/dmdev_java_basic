package com.jsd.lesson_06;

public class ForExample {

    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {
            if (value == 5) {
                continue;
//                break;
            }
            System.out.println(value);
        }

//        for (int value = 10; value > 0; value--) {
//            System.out.println(value);
//        }
    }

    private static void forExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
