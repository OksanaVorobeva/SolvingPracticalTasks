package com.exampl.guru.multithreading.thread;

public class TreadExample  extends Thread {
    public TreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() );
    }

}
class TestThread1  {
    public static void main(String[] args) {
        TreadExample treadExample1 = new TreadExample("Поток 1");
        treadExample1.start();
        TreadExample treadExample2 =new TreadExample("Поток 2");
        treadExample2.start();
        TreadExample treadExample3 =new TreadExample("Поток 3");
        treadExample3.start();
    }
}

