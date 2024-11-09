package com.exampl.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    //Подсчет повторяющихся символов
    public static void main(String[] args) {
        String str = "askskbc";
        System.out.println(countDuplicateCharacters(str));
        System.out.println(countDuplicateCharacters2(str));
    }

    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateCharacters2(String str) {
        Map<Character, Long> result = new HashMap<>();
        result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }

}
