package com.exampl.arrayCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Task121 {
    //Замена элементов в списке

    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));
        UnaryOperator<Melon> operator = t
                ->(t.getWeight()<3000)?new Melon(t.getType(), 3000):t;
        melons.replaceAll(operator);

    }
}