package com.exampl.guru.multithreading.thread;

public class RunnableExample implements Runnable {
    private String localName;
    public RunnableExample(String localName) {
        this.localName = localName;
    }
    public void run() {
        System.out.println("Running " + localName);
    }
}

class TestRunnable  {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample("t1"));
        Thread t2 = new Thread(new RunnableExample("t2"));
        Thread t3 = new Thread(new RunnableExample("t3"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
