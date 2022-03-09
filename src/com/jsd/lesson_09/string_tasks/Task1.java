package com.jsd.lesson_09.string_tasks;

/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class Task1 {

    public static void main(String[] args) {
        String value = "asdaksk :( asda :) asdas :) asdad :( asdas :(";
        var replace = replace(value);
        System.out.println(replace);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
