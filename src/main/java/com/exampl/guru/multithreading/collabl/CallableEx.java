package com.exampl.guru.multithreading.collabl;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class CallableEx implements Callable {
    private String word;

    public CallableEx(String word) {
        this.word = word;
    }

    public Integer call()  {
        System.out.println(Thread.currentThread().getName() + " " + word.length());
        return Integer.valueOf(word.length());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String word = "Hello World fff";
        String[] words = word.split(" ");

        ExecutorService pool = Executors.newFixedThreadPool(10);
        Set<Future<Integer>> set = new HashSet<>();
        for (String s : words) {
            Callable<Integer> callable = new CallableEx(s);
            Future<Integer> future = pool.submit(callable);
            set.add(future);
        }
        int sum = 0;
        for (Future<Integer> future : set) {
            sum+=future.get();
        }
        System.out.println(sum);
        pool.shutdown();
    }
}
