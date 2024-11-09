package com.exampl.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2 {
    //Отыскание первого неповторяющегося символа
    private static final int EXTENDED_ASCII_CODES = 256;

    public static void main(String[] args) {
        String string = "wwwihdjkhhhdhdhsb";
        System.out.println(firstNonRepeatedCharacter(string));
        System.out.println(firstNonRepeatedCharacter2(string));
        System.out.println(firstNonRepeatedCharacter3(string));
    }

    public static char firstNonRepeatedCharacter(String str) {
        int[] flag = new int[EXTENDED_ASCII_CODES];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (flag[c] == -1) {
                flag[c] = i;
            } else {
                flag[c] = -2;
            }
        }
        int pos = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flag[i] >= 0) {
                pos = Math.min(pos, flag[i]);
            }
        }
        return pos == Integer.MAX_VALUE ?
                Character.MAX_VALUE : str.charAt(pos);
    }

    public static char firstNonRepeatedCharacter2(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            chars.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MAX_VALUE;
    }

    public static String firstNonRepeatedCharacter3(String str) {
        Map<Integer, Long> chars = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new
                        , Collectors.counting()));
        int cp = chars.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }
}
