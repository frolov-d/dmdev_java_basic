package com.jsd.oop_lesson_2;

public class Computer {

    int ssd = 500;
    int ram = 1024;

    Computer() {
        System.out.println("Я был создан");
    }

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
