package com.jsd.oop.oop_lesson_2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();
//        System.out.println("Ram: " + computer.ram);
//        System.out.println("Ssd: " + computer.ssd);

        Computer computer2 = new Computer(128, 16L);
        computer2.printState();
        computer2.load(true);
    }
}
