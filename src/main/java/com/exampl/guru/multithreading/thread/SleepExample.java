package com.exampl.guru.multithreading.thread;

public class SleepExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class TestSleepExample {
    public static void main(String[] args) {
        SleepExample sleepExample = new SleepExample();
        Thread thread1 = new Thread(sleepExample);
        thread1.setName("fred");
        Thread thread2 = new Thread(sleepExample);
        thread2.setName("lucy");
        Thread thread3 = new Thread(sleepExample);
        thread3.setName("ricky");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
