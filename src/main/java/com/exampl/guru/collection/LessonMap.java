package com.exampl.guru.collection;

import java.util.*;

public class LessonMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(20);
        }

        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(Arrays.toString(arr));

        for(int i:arr){
            if (map.containsKey(i)){
                int value = map.get(i);
                map.put(i,++value);
            }else {
                map.put(i,0);
            }
        }
        System.out.println(map);
    }
}
