package com.exampl.string;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task3 {
    //Инвентирование букв и слов

    private static final String WHITESPACE = " ";
    private static final Pattern PATTERN = Pattern.compile(" +");

    public static void main(String[] args) {
        String string = "Hello word";
        System.out.println(reverseWords(string));
        System.out.println(reverseWords2(string));
        System.out.println(reverse(string));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(WHITESPACE);
        }
        return reversedString.toString();
    }

    public static String reverseWords2(String s) {
        return PATTERN.splitAsStream(s)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }


}
