package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Task99 {

    //Сортировка массива

    public static void main(String[] args) {
        Melon[] melons = new Melon[3];
        melons[0] = new Melon("a", 3);
        melons[1] = new Melon("c", 6);
        melons[2] = new Melon("b", 2);
       /* Arrays.sort(melon,new Comparator<Melon>() {
            @Override
            public int compare(Melon o1, Melon o2) {
                return Integer.compare(o1.getWeight(),o2.getWeight());
            }
        });*/
/*
        Arrays.sort(melon,(Melon m1,Melon m2)
                ->Integer.compare(m1.getWeight(),m2.getWeight()));*/

 /*       Arrays.parallelSort(melon, new Comparator<Melon>() {
            @Override
            public int compare(Melon o1, Melon o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        });

    }*/

        Arrays.parallelSort(melons, (Melon melon1, Melon melon2)
                -> Integer.compare(melon1.getWeight(), melon2.getWeight()));
        System.out.println(Arrays.toString(melons));

        Integer[] integers = new Integer[]{3, 1, 5};
        // Arrays.sort(integers, Comparator.reverseOrder());
    /*    Arrays.sort(integers);
        for (int leftHead=0,rightHead=integers.length-1;
        leftHead<rightHead; leftHead++, rightHead--) {
            int element = integers[leftHead];
            integers[leftHead]=integers[rightHead];
            integers[rightHead]=element;
        }*/


        int[] desIntegers = Arrays.stream(integers)
                .map(i -> i)
                .sorted((i1, i2) -> Integer.compare(i2, i1))
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(desIntegers));
    }
}

class Melon implements Comparator<Melon> ,Comparable{
    private final String type;
    private final int weight;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Melon{" +
               "type='" + type + '\'' +
               ", weight=" + weight +
               '}';
    }

    @Override
    public int compare(Melon o1, Melon o2) {
        return o1.getType().compareTo(o2.getType());
    }

    @Override
    public int compareTo(Object o) {
        Melon melon = (Melon) o;
        return Integer.compare(this.weight, melon.getWeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Melon melon = (Melon) o;
        return weight == melon.weight && Objects.equals(type, melon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }


}

