package com.exampl.arrayCollection;

import java.util.*;

import static java.util.Map.entry;

public class Task109 {
    //Создание немодифицируемых/немутируемых коллекций

    private static final List<Integer> LIST = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
    private static final List<Integer> LIST2 = List.of(1, 2, 3, 4, 5);

    //Задача 1 Создать список обьектов Melon посредством метода Collections.unmodifiableList
    private final Melon melon1 = new Melon("Grenshaw", 2000);
    private final Melon melon2 = new Melon("Gac", 1200);
    private final List<Melon> list = Collections.unmodifiableList(Arrays.asList(melon1, melon2));
    //обьекты можно мутировать

    //Задача 2 создать список по средством Arrays.asList

    private final List<Melon> list2 = Collections.unmodifiableList(Arrays.asList(
            new Melon("Grenshaw", 2000),
            new Melon("Gac", 1200)
    ));
    //список немодифицируемый, обьекты могут быть мутированы

    //Задача 3 Создать список посредством Collections.unmodifiableList и статического блока
    private static final List<Melon> list3;

    static {
        final Melon melon1 = new Melon("Grenshaw", 2000);
        final Melon melon2 = new Melon("Gac", 1200);
        list3 = Collections.unmodifiableList(Arrays.asList(melon1, melon2));
    }

    //Список немодифицируемый обьекты могут быть мутированы

    //Задача 4 Создать список посредством List.of

    private final List<Melon> list4 = List.of(melon1, melon2);
    //Список немодифицируемый обьекты могут быть мутированы

    //Задача 5 Создать спимок немутируемых обьектов по средствам Collections.unmodifiableList List.of
    private static final ImmutableMelon MELON_1 = new ImmutableMelon("Grenshaw", 2000);
    private static final ImmutableMelon MELON_2 = new ImmutableMelon("Gac", 1200);

    private static final List<ImmutableMelon> LIST5 = Collections.unmodifiableList(Arrays.asList(MELON_1, MELON_2));
    private static final List<ImmutableMelon> LIST6 = List.of(MELON_1, MELON_2);

    //являеться немодифицируемым мы неможем мутировать обьекты
    //немодифицируемые
    Map<Integer, Melon> mapOfSingleMelon = Collections.singletonMap(1, new Melon("Grenshaw", 2000));
    //немутируемые
    Map<Integer, ImmutableMelon> mapOfSingleMelon2 = Collections.singletonMap(1, new ImmutableMelon("Gac", 1200));

    //unmodifiable Map.Entry containing the given key and value
    Map<Integer, Melon> mapOfMelon = Map.ofEntries(
            entry(1, new Melon("Apollo", 3000)),
            entry(2, new Melon("Jade Dew", 3500)),
            entry(3, new Melon("Cantaloupe", 1500))
    );

    //Немутируемые
    Map<Integer, ImmutableMelon> mapOfMelon2 = Map.ofEntries(
            entry(1, new ImmutableMelon("Apollo", 3000)),
            entry(2, new ImmutableMelon("Jade Dew", 3500)),
            entry(3, new ImmutableMelon("Cantaloupe", 1500))
    );

    //немутируемый массив

    /* static final String[] immutable =new String[0];

     public final class ImmutableArray<T> {
         private final T[] array;
         public ImmutableArray(T[] array) {
             array =Arrays.copyOf(array, array.length);
         }
         public static <T> ImmutableArray<T> from (T[] array) {
             return new ImmutableArray<>(array)
         }
         public T get(int index) {
             return array[index];
         }
     }*/


    public static void main(String[] args) {
        //немодифицуруемый/немутируемы получить из модифицируемого/мутируемого
        Map<Integer, ImmutableMelon> mapOfMelon3 = new HashMap<>();
        mapOfMelon3.put(1, new ImmutableMelon("Apollo", 3000));
        mapOfMelon3.put(2, new ImmutableMelon("Jade Dew", 3500));
        Map<Integer, ImmutableMelon> mapOfMelon4 = Map.copyOf(mapOfMelon3);
    }

}


class ImmutableMelon {
    private final String type;
    private final int weight;

    public ImmutableMelon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
