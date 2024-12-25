package com.exampl.guru.multithreading.collablHW;

import java.util.*;
import java.util.concurrent.*;

public class Task2 {
}

class GeneratorNumber implements Callable<String> {
    int num =0;

    @Override
    public String call() throws Exception {

        for (int i = 0; i < 10; i++) {
            num+=new Random().nextInt(10);
        }
        Thread.sleep(1500);
        System.out.println(Thread.currentThread().getName() );

        return String.valueOf(num);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 10; i++) {
            Callable<String> numberGenerator = new GeneratorNumber();
            Future<String> future = pool.submit(numberGenerator);
            System.out.println(future.get());
        }

        pool.shutdown();
    }
}
