package com.exampl.arrayCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Task113 {
    //Замена элементов в отображение Map
    public static void main(String[] args) {
        Map<Integer,Melon> mapOfMelons = new HashMap<>();
        mapOfMelons.put(1,new Melon("Apollo",3000));
        mapOfMelons.put(2,new Melon("Jade Dew",3500));
        mapOfMelons.put(3,new Melon("Cantaloupe",1500));
        Melon melon = mapOfMelons.replace(2,new Melon("Gac",1000));
        System.out.println(mapOfMelons.values());
        boolean melon2=mapOfMelons.replace(1,new Melon("Apollo",3000),new Melon("Bitter",4300));
        System.out.println(mapOfMelons.values());
        BiFunction<Integer,Melon,Melon> function =(k,v)
        -> v.getWeight()>1000? new Melon(v.getType(),1000):v;
        mapOfMelons.replaceAll(function);
        System.out.println(mapOfMelons.values());
    }
}
