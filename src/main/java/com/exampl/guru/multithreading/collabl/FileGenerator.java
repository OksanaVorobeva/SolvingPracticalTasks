package com.exampl.guru.multithreading.collabl;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class FileGenerator implements Callable {
    @Override
    public List<String>call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> files = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            String fileName = threadName+"_"+i+"txt";
            files.add(fileName);

            try(OutputStream os = new FileOutputStream(fileName) ;
            BufferedOutputStream bos = new BufferedOutputStream(os)) {
                bos.write(("Java"+i).getBytes());
                bos.flush();
            }
        }
        Thread.sleep(1000);
        return files;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool= Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures=new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> callable=new FileGenerator();
            Future<List<String>> future=pool.submit(callable);
            futures.add(future);
        }

        List<String> result= new ArrayList<>();
        for (Future <List<String>> f : futures) {
            result.addAll(f.get());
        }
        System.out.println(result);
        pool.shutdown();
    }
}
