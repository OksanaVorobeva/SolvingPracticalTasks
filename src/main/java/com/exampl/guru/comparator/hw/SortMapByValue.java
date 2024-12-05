package com.exampl.guru.comparator.hw;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "two", 2,
                "five", 5,
                "three", 3,
                "one", 1,
                "four", 4
        );

        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);
        sortedMap.entrySet().forEach(System.out::println);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new NumberComparator(map));
        sortedMap.putAll(map);
        return sortedMap;
    }


}
class NumberComparator implements Comparator<String> {
    private final Map<String, Integer> map;
    public NumberComparator(Map<String, Integer> map) {
        this.map = map;
    }
    public int compare(String o1, String o2) {
        return map.get(o1) - map.get(o2);
    }
}


