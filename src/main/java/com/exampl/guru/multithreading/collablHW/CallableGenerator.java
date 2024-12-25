package com.exampl.guru.multithreading.collablHW;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class CallableGenerator implements Callable<Set<String>> {

    @Override
    public Set<String> call() throws Exception {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName() + "_" + i + "txt";
            set.add(threadName);

            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(threadName))) {
                bos.write(threadName.getBytes(StandardCharsets.UTF_8));
                bos.flush();
            }
        }

        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);

        return set;
    }
}

class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<Set<String>>> futures = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            Callable<Set<String>> callable = new CallableGenerator();
            Future<Set<String>> future = pool.submit(callable);
            futures.add(future);
        }

        Set<String> set = new HashSet<>();

        for (Future<Set<String>> future : futures) {
            set.addAll(future.get());
        }

        System.out.println(set);

        pool.shutdown();
    }
}
