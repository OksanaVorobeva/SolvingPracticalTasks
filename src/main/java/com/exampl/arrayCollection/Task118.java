package com.exampl.arrayCollection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Task118 {
    //Удаление всех элементов коллекции, которые совпадают с предикатом
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

        //Удаление по средствои итератора
        StreamSupport.stream(melons.spliterator(), false).count();
        ((Collection<?>) melons).size();

        //Удаление посредством Collection.removeIf
        melons.removeIf(t -> t.getWeight() < 3000);

        //Удаление посредством Stream
        List<Melon> filteredMelons = melons.stream()
                .filter(t->t.getWeight()>=3000)
                .collect(Collectors.toList());

        //Разбиение элементов посредством коллектора

        Map<Boolean, List<Melon>>separatedMelons =melons.stream()
                .collect(Collectors.partitioningBy(
                        (Melon t)->t.getWeight()>=3000));
        List<Melon> weighLessThan30000 = separatedMelons.get(false);
        List<Melon> weighGreaterThan30000 = separatedMelons.get(true);

        boolean allTheSame = Collections.frequency(
                melons,melons.get(0))==melons.size();
    }


}
