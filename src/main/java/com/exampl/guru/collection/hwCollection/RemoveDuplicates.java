package com.exampl.guru.collection.hwCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomInt = random.nextInt(10);
            list.add(randomInt);
        }
        System.out.println(list);

        HashSet<Integer> hashSet = new HashSet<>(list);
         list.clear();
         list.addAll(hashSet);

         System.out.println(hashSet);
    }
}
