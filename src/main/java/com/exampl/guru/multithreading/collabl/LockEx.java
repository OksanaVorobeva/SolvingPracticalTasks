package com.exampl.guru.multithreading.collabl;

import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock lock = new ReentrantLock();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CommonThread(commonResource, lock));
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}

class CommonResource {
    int counter = 0;
}

class CommonThread implements Runnable {
    CommonResource commonResource;
    ReentrantLock lock;

    public CommonThread(CommonResource commonResource, ReentrantLock lock) {
        this.commonResource = commonResource;
        this.lock = lock;
    }

    public void run() {
        lock.lock();
            try {
                commonResource.counter=1;
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + commonResource.counter);
                    commonResource.counter++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }
