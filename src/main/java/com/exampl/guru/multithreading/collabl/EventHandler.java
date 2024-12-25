package com.exampl.guru.multithreading.collabl;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class EventHandler implements Callable {

    private LocalDateTime eventDate;

    public EventHandler(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String call() throws InterruptedException {
        long d =0;
        while ((d=Duration.between(LocalDateTime.now(),eventDate).toSeconds())>=0) {
            System.out.println("Event: " + Thread.currentThread().getName()+" will be started in "+
                              d+" seconds" );
            Thread.sleep(1000);
        }
        return "Event: " + Thread.currentThread().getName()+" has been started";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        LocalDateTime eventDate = LocalDateTime.now();
        Callable<String> event1 = new EventHandler(eventDate.plusSeconds(5));
        Callable<String> event2 = new EventHandler(eventDate.plusSeconds(10));
        Callable<String> event3 = new EventHandler(eventDate.plusSeconds(15));
        Callable<String> event4 = new EventHandler(eventDate.plusSeconds(20));
        Callable<String> event5 = new EventHandler(eventDate.plusSeconds(25));
        Future<String> result1 = pool.submit(event1);
        Future<String> result2 = pool.submit(event2);
        Future<String> result3 = pool.submit(event3);
        Future<String> result4 = pool.submit(event4);
        Future<String> result5 = pool.submit(event5);

        System.out.println(result1.get());
        System.out.println(result2.get());
        System.out.println(result3.get());
        System.out.println(result4.get());
        System.out.println(result5.get());
        pool.shutdown();
    }
}
