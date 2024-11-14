package com.exampl.string;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task14 {
    //Отыскивание символа с наибольшим числом появлений

    private static final int EXTENDED_ASCII_CODE = 256;

    public static void main(String[] args) {
        String str = "abcadefg";
        System.out.println(maxOccurenceCharacter(str));
        System.out.println(maxOccurenceCharacter2(str));
    }

    public static Pair<Character, Integer> maxOccurenceCharacter(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!Character.isWhitespace(c)) {
                Integer noCh = counter.get(c);
                if (noCh == null) {
                    counter.put(c, 1);
                } else {
                    counter.put(c, ++noCh);
                }
            }
        }
        int max = Collections.max(counter.values());
        char maxChar = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == max) {
                maxChar = entry.getKey();
            }
        }
        return Pair.of(maxChar, max);
    }

    public static Pair<Character, Integer> maxOccurenceCharacter2(String str) {
        int maxOccurrences = -1;
        char maxCharacter = Character.MIN_VALUE;
        char[] chStr = str.toCharArray();
        int[] asciiCodes = new int[EXTENDED_ASCII_CODE];

        for (int i = 0; i < chStr.length; i++) {
            char currenrChar = chStr[i];
            if (!Character.isWhitespace(currenrChar)) {
                int code = (int) currenrChar;
                asciiCodes[code]++;
                if (asciiCodes[code] > maxOccurrences) {
                    maxOccurrences = asciiCodes[code];
                    maxCharacter = currenrChar;
                }
            }
        }
        return Pair.of(maxCharacter, maxOccurrences);
    }
}
