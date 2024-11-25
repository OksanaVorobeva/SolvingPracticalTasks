package com.exampl.arrayCollection;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Task115 {
    //Сортировка отображения Map
    public static void main(String[] args) {
        Map<String, Melon> melons = new HashMap<>();
        melons.put("delicious", new Melon("Apollo", 3000));
        melons.put("refreshing", new Melon("Jade Dew", 3500));
        melons.put("famous", new Melon("Cantaloupe", 1500));

        //TreeMap в естественном порядке
        TreeMap<String, Melon> sortedMap = sortByKeyTreeMap(melons);
        System.out.println(sortedMap.values());
        //Сортировка по ключу и значению посредством Steam и Comparator
        Comparator<String> byInt = Comparator.naturalOrder();
        Map<String, Melon> sortedMap2 = sortByKeyStream(melons, byInt);
        System.out.println(sortedMap2.values());
        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);
        Map<String, Melon> sortedMap3 = sortByValuesStream(melons, byWeight);
        System.out.println(sortedMap3.values());

        //Сортировка по ключу и значению посредством List

        List<String> sortedKeys =sortByKeyList(melons);
        System.out.println(sortedKeys);
        List<Melon> sortedValues =sortByValueList(melons);
        System.out.println(sortedValues);

        SortedSet<String> sortedSetKeys=new TreeSet<>(sortedMap.keySet());
        System.out.println(sortedSetKeys);
        SortedSet<Melon> sortedSetValues=new TreeSet<>(sortedMap.values());
        System.out.println(sortedSetValues);

    }

    public static <K, V> TreeMap<K, V> sortByKeyTreeMap(Map<K, V> map) {
        return new TreeMap<>(map);
    }

    public static <K, V> Map<K, V> sortByKeyStream(
            Map<K, V> map, Comparator<? super K> comparator) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(comparator))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));
    }

    public static <K, V> Map<K, V> sortByValuesStream(
            Map<K, V> map, Comparator<? super V> comparator) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));
    }

    public static <K extends Comparable, V> List<K>
    sortByKeyList(Map<K, V> map) {
        List<K> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        return list;
    }

    public static <K, V extends Comparable> List<V>
    sortByValueList(Map<K, V> map) {
        List<V> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }
}
