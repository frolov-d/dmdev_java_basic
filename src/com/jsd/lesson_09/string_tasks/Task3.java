package com.jsd.lesson_09.string_tasks;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращаюшую инициалы в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 */
public class Task3 {

    public static void main(String[] args) {
        var result = format("Иван", "Петров", "Сидорович");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
//        var firstNameChar = firstName.toUpperCase().charAt(0);
//        var lastNameChar = lastName.toUpperCase().charAt(0);
//        var patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        var firstNameChar = Character.toUpperCase(firstName.charAt(0));
        var lastNameChar = Character.toUpperCase(lastName.charAt(0));
        var patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
//        return lastNameChar + "." + firstNameChar + "." + patronymicNameChar;
        return String.format("%s.%s.%s", lastNameChar, firstNameChar, patronymicNameChar);
    }
}
