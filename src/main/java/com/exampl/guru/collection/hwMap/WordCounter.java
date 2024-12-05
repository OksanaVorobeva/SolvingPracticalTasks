package com.exampl.guru.collection.hwMap;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine();
        List<String> words = Arrays.asList(text.split(" "));
        System.out.println(words);

        Map<String, Integer> duplicationMap = new HashMap<>();

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!cleanWord.isEmpty()) {
                duplicationMap.put(cleanWord, duplicationMap.getOrDefault(cleanWord, 0) + 1);
            }
        }
        System.out.println(duplicationMap);

    }
}
