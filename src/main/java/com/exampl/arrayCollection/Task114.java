package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task114 {
    //Сравнение двух отображений Map
    public static void main(String[] args) {
        Map<Integer, Melon> melon1Map = new HashMap<>();
        Map<Integer, Melon> melon2Map = new HashMap<>();
        melon1Map.put(1, new Melon("Apollo", 3000));
        melon1Map.put(2, new Melon("Jade Dew", 3500));
        melon1Map.put(3, new Melon("Cantaloupe", 1500));
        melon2Map.put(1, new Melon("Apollo", 3000));
        melon2Map.put(2, new Melon("Jade Dew", 3500));
        melon2Map.put(3, new Melon("Cantaloupe", 1500));
        boolean equals2Map = melon1Map.equals(melon2Map);
        System.out.println(equals2Map);

        Melon[] melons1Array = {
                new Melon("Apollo", 3000),
                new Melon("Jade Dew", 3500),
                new Melon("Cantaloupe", 1500)};

        Melon[] melons2Array = {
                new Melon("Apollo", 3000),
                new Melon("Jade Dew", 3500),
                new Melon("Cantaloupe", 1500)};

        Map<Integer, Melon[]> melons1ArrayMap = new HashMap<>();
        melons1ArrayMap.put(1, melons1Array);
        Map<Integer, Melon[]> melons2ArrayMap = new HashMap<>();
        melons2ArrayMap.put(1, melons2Array);

        boolean equals12ArrayMap = melons1Array.equals(melons2Array);
        System.out.println(equals12ArrayMap);

        boolean equals12ArrayMap2 = equalsWithArrays(melons1ArrayMap, melons2ArrayMap);
        System.out.println(equals12ArrayMap2);


    }

    public static <A, B> boolean equalsWithArrays(
            Map<A, B[]> first, Map<A, B[]> second) {
        if (first.size() != second.size()) {
            return false;
        }
        return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(),
                        second.get(e.getKey())));
    }

}
