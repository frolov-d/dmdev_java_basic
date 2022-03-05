package com.jsd.oop.oop_lesson_2;

public class Computer {

    private int ssd = 500;
    private long ram = 1024;

    public Computer() {
        System.out.println("Я был создан");
    }

    public Computer(int ssd, long ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer(long ram, int ssd) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
