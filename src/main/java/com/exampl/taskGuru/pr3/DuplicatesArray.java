package com.exampl.taskGuru.pr3;

import java.util.*;

public class DuplicatesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        Map<Integer,Integer> duplicationMap = new HashMap<>();

        for (int i :array) {
            if (duplicationMap.containsKey(i)) {
                int duplicationCount = duplicationMap.get(i);
                duplicationMap.put(i, ++duplicationCount);
            }else {
                duplicationMap.put(i, 0);
            }
        }

        System.out.println(duplicationMap);
    }
}
