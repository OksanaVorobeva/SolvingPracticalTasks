package com.exampl.guru.collection.hwMap;

import java.util.HashMap;
import java.util.Map;

public class CharscterCounter {
    public static void main(String[] args) {
        System.out.println(getCharsCount("baaccc"));
    }

    public static Map<Character, Integer> getCharsCount(String s) {

        Map<Character, Integer> duplicationMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            duplicationMap.put(c, duplicationMap.getOrDefault(c, 0) + 1);
        }
        return duplicationMap;
    }
}
