package com.exampl.arrayCollection;

import java.util.HashMap;
import java.util.Map;

public class Task110 {
    //Возврат значения по умолчанию из коллекции Map

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","123");
        map.put("b","456");
        map.put("c","789");
        System.out.println(map.get("d"));
        String hp1=map.getOrDefault("d","123");
        System.out.println(hp1);
    }
}
