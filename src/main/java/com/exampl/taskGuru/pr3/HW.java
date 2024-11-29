package com.exampl.taskGuru.pr3;


import java.util.*;

public class HW {
    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>();
        ratings.add(3);
        ratings.add(5);
        ratings.add(3);
        ratings.add(4);
        ratings.add(2);
        ratings.add(4);


        Iterator<Integer> iterator = ratings.iterator();
        while (iterator.hasNext()) {
            int grade = iterator.next();
            if (grade<4) {
                iterator.remove();
            }
        }

        System.out.println(ratings);

        Iterator<Integer> iterator2 = ratings.iterator();
        int max=Integer.MIN_VALUE;
        while (iterator2.hasNext()) {
            int grade = iterator2.next();
            if (grade>max) {
                max=grade;
            }
        }
        System.out.println(max);
    }
}
class HW2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);

    }
}

