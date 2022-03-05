package com.jsd.oop.oop_lesson_3;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}
