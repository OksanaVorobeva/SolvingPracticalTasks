package com.exampl.guru.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaReturnTask {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(30);
        for (int i = 0; i < size; i++) {
            integerList.add(random.nextInt(100));
        }

        System.out.println(integerList);

        System.out.println(action(integerList).execute(integerList));

    }

    interface Operation2<V, T> {
        V execute(T t);
    }

    private static Operation2 action(List<Integer> list) {
        if (list.size() > 20) {
            Operation2<Integer, List<Integer>> operation2 = l -> {
                int sum = 0;
                for (int i : l) {
                    sum += i;
                }
                return sum;
            };
            return operation2;
        } else if (list.size() > 10) {
            Operation2<String, List<Integer>> operation2 = l -> {
                String result = "";
                for (int i : l) {
                    result = result + i;
                }
                return result;
            };
            return operation2;
        } else {
            Operation2<Integer, List<Integer>> operation2 = l -> {
                int result = 1;
                for (int i : l) {
                    result *= i;
                }
                return result;
            };
            return operation2;
        }
    }
}
