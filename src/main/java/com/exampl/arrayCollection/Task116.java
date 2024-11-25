package com.exampl.arrayCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task116 {
    //копирование отображения HashMap
    public static void main(String[] args) {

    }

    @SuppressWarnings("unchecked")
    public static <K, V> HashMap<K, V> shallowCopy(Map<K, V> map) {
        HashMap<K, V> copy = new HashMap<>(map);
        copy.putAll(map);
        return copy;
    }

    @SuppressWarnings("unchecked")
    public static <K, V> HashMap<K, V> shallowCopy2(Map<K, V> map) {
        Set<Map.Entry<K, V>> entries = map.entrySet();
        HashMap<K, V> copy = (HashMap<K, V>) entries.stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue
                ));
        return copy;
    }

}
