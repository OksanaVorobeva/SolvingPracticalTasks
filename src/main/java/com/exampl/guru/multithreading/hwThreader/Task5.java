package com.exampl.guru.multithreading.hwThreader;

public class Task5 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();

        myThread3.setMyThread1(myThread1);
        myThread1.setMyThread2(myThread2);
        myThread2.setMyThread3(myThread3);

        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();
    }
}

class MyThread1 implements Runnable {
    private MyThread2 myThread2;


    @Override
    public void run() {
        this.a();
    }

    public synchronized void a() {
        System.out.println("MyThread3 in class MyThread1");
        myThread2.b();
    }

    public void setMyThread2(MyThread2 myThread2) {
        this.myThread2 = myThread2;
    }
}

class MyThread2 implements Runnable {
    private MyThread3 myThread3;

    @Override
    public void run() {
        this.b();
    }

    public synchronized void b() {
        System.out.println("MyThread3 in class MyThread2");
        myThread3.c();
    }

    public void setMyThread3(MyThread3 myThread3) {
        this.myThread3 = myThread3;
    }
}

class MyThread3 implements Runnable {
    MyThread1 myThread1;

    @Override
    public void run() {
        this.c();
    }

    public synchronized void c() {
        System.out.println("MyThread1 in class MyThread3");
        myThread1.a();
    }

    public void setMyThread1(MyThread1 myThread1) {
        this.myThread1 = myThread1;
    }
}