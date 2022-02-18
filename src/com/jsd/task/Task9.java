package com.jsd.task;

/**
 * 5. Написать программу, которая проходит циклом по английскому
 *  алфавиту, начиная с буквы 'b', и находит каждую букву до тех пор,
 *  пока не встретит гласную (т.е. вывести согласные на консоль).
 */

public class Task9 {

    public static void main(String[] args) {
        printLetters();
    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter) ; letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return  value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }
}
