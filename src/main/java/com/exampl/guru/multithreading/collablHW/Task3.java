package com.exampl.guru.multithreading.collablHW;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.*;

public class Task3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        File file=new File("tsk3.tst");
        if(file.exists()){
            file.delete();
        }

        ExecutorService pool = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 10; i++) {
            Callable3 callable3 = new Callable3();
            Future<String> future = pool.submit(callable3);
            callable3.writeToFile(file,future.get());
        }

        pool.shutdown();
    }
}


class Callable3 implements Callable<String> {


    @Override
    public String call() throws Exception {
        String str = "Hello World" + LocalTime.now();
        System.out.println(Thread.currentThread().getName() + str);
        Thread.sleep(1000);
        return str;
    }

    public synchronized void writeToFile(File file,String str) {
        try (BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file,true))){
            bos.write((str+"\n").getBytes(StandardCharsets.UTF_8));
            bos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}