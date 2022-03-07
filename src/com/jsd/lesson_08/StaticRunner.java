package com.jsd.lesson_08;

import com.jsd.oop.oop_lesson_3.Computer;

public class StaticRunner {

    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer1 = new Computer(null, null);
        Computer computer = new Computer(null, null);
        System.out.println(Computer.getCounter());
        Class<? extends Computer> aClass = computer.getClass();
        Class<? extends Computer> aClass1 = computer1.getClass();
        System.out.println(aClass == aClass1);
        System.out.println(computer == computer1);
    }
}
