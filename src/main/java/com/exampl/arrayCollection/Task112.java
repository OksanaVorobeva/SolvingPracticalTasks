package com.exampl.arrayCollection;

import java.util.HashMap;
import java.util.Map;

public class Task112 {

    //Удаление элемента из отображение Map
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"postgresql");
        map.put(2,"mysql");
        map.put(3,"derby");
        String r1=map.remove(1);
        System.out.println(r1);
        String r2=map.remove(4);
        System.out.println(r2);
        System.out.println(map.values());
        boolean r3=map.remove(2,"mysql");
        System.out.println(r3);
        Boolean r4=map.remove(3,"mysql");
        System.out.println(r4);
        System.out.println(map.values());
        map.entrySet().removeIf(e->e.getValue().equals("mysql"));
        System.out.println(map.values());
    }
}
