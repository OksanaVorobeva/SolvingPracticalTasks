package com.exampl.arrayCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task120 {
    //Фильтрация коллекции по списку
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        List<String> melonsByType =
                Arrays.asList("Apollo", "Gac", "Crenshaw", "Hami");

        List<Melon> result =melons.stream()
                .filter(t->melonsByType.contains(t.getType()))
                .collect(Collectors.toList());
        System.out.println(result);

        Set<String> melonsSetByType =melonsByType.stream()
                .collect(Collectors.toSet());
        List<Melon> result2 =melons.stream()
                .filter(t->melonsSetByType.contains(t.getType()))
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}

