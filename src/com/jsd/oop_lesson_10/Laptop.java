package com.jsd.oop_lesson_10;

public final class Laptop extends Computer {

    private int weight;

    {
        System.out.println("init block Laptop");
    }

    static {
        System.out.println("static block Laptop");
    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super();
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("Constructor laptop");
    }

    @Override
    public void load() {
        System.out.println();
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
