package com.exampl.arrayCollection;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

import static java.util.Map.entry;

public class Task125 {
    //кортеж

    public static void main(String[] args) {
        Melon[] melons = {
                new Melon("Grenshaw", 2000), new Melon("Gac",1200),
                        new Melon("Bitter",2200),new Melon("Hami",800)
        };
        Comparator<Melon> byWeight =Comparator.comparing(Melon::getWeight);
        Map.Entry<Melon,Melon> minmax =array(melons, byWeight);
        System.out.println(minmax.getKey());
        System.out.println(minmax.getValue());
        System.out.println(array(melons, byWeight));
    }

    public static <T>Map.Entry<T,T> array(
            T[] arr, Comparator<? super T> c){
        T min = arr[0];
        T max = arr[0];
        for(T elem : arr) {
            if (c.compare(min, elem) > 0) {
                min = elem;
            } else if (c.compare(max, elem) < 0) {
                max = elem;
            }
        }
        return entry(min,max);
    }

    public static <T> Pair<T,T> array2(T[] arr, Comparator<? super T> c){
        T min = arr[0];
        T max = arr[0];
        for(T elem : arr) {
            if (c.compare(min, elem) > 0) {
                min = elem;
            } else if (c.compare(max, elem) < 0) {
                max = elem;
            }
        }
        return Pair.of(min,max);
    }


}

final class Pair<L,R>{
   final  L left  ;
   final  R right ;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    static <L,R> Pair<L,R> of(L left, R right) {
        return new Pair<>(left, right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(left, pair.left) && Objects.equals(right, pair.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
