package com.jsd.oop_lesson_10;

public class PolyLessonRunner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
//        laptop.load();
//        System.out.println();
        Computer mobile = new Mobile(new Ssd(250), new Ram(1024));

        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);
//        mobile.load();
//        loadComputers(laptop, mobile);
        printInfo(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInfo(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop) {
                Laptop laptop = (Laptop) computer;
                laptop.open();
            }
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
