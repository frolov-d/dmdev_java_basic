package com.jsd.task;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */

public class Task3 {

    public static void main(String[] args) {
        int ruble = 112;
//        рубль 1 !11
//        рублей 5, 6, 7, 8, 9, 10, 11-19
//        рубля 2, 3, 4
        int reminderByTen = ruble % 10;
        int reminderByHundred = ruble % 100;
        if ((reminderByTen == 1) && (reminderByHundred != 11)) {
            System.out.println(ruble + " рубль");
        } else if ((reminderByTen == 2 || reminderByTen == 3 || reminderByTen == 4)
            && !(reminderByHundred == 12 || reminderByHundred == 13 || reminderByHundred == 14)) {
            System.out.println(ruble + " рубля");
        } else {
            System.out.println(ruble + " рублей");
        }
    }
}
