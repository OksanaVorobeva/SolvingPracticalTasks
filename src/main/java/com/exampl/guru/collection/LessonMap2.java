package com.exampl.guru.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LessonMap2 {
    public static void main(String[] args) {
        Map<Integer, String> srates = new HashMap<>();
        srates.put(1, "Germany");
        srates.put(2, "Spain");
        srates.put(3, "France");
        srates.put(4, "Italy");
        String first = srates.get(2);
        System.out.println(first);
        Set<Integer> keys = srates.keySet();
        System.out.println(keys);
        Collection<String> values = srates.values();
        System.out.println(values);
        srates.replace(1, "Poland");
        srates.remove(2);
        for (Map.Entry<Integer, String> entry : srates.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
