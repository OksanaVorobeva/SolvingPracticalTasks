package com.exampl.string;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task5 {
    //Подсчет гласных и согласных
    private static final Set<Character> allVowels =
            new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        String str = "aiibcd";
        System.out.println(countVowelsAnd(str));
        System.out.println(countVowelsAn2d(str));
    }

    public static Pair<Integer, Integer> countVowelsAnd(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        return Pair.of(vowels, consonants);
    }

    public static Pair<Long, Long> countVowelsAn2d(String str) {
        str = str.toLowerCase();
        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();
        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Pair.of(vowels, consonants);
    }


}
