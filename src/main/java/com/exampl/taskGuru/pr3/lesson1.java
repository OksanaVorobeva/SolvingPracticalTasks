package com.exampl.taskGuru.pr3;

import java.util.*;

public class lesson1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(20));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next()%2==0){
                iterator.remove();
            }
        }

        Set<Integer> set=new TreeSet<>(list);
        System.out.println(set   );
    }
}
