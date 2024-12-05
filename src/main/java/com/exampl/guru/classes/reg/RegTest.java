package com.exampl.guru.classes.reg;

public class RegTest {
    public static void main(String[] args) {
        System.out.println("20934f".matches("^[012][0-9]+]"));
        System.out.println("20934".matches("[0-9]+"));
        System.out.println("20934".matches("\\d+"));

        System.out.println("20934453".matches("[0-9][0-9][0-9][0-9][0-9]"));

        String s ="Te4st 2string 9for 7split";
        String[] words = s.split("[0-5]");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
