package com.exampl.guru.multithreading.thread;

import javax.annotation.processing.Messager;

class Waiter implements Runnable {
    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name+ "wait coll of methods nitify: "+System.currentTimeMillis());
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+"was coll of method notify: "+System.currentTimeMillis());
            System.out.println(name+ ":"+msg.getMsg());
        }
    }
}

class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name +"Start");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+ "notife finiched");
                msg.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Message{
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {

        Message msg = new Message("Обработать");
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1,"waiter1").start();
        Waiter waiter2 = new Waiter(msg);
        new Thread(waiter2,"waiter2").start();
        Notifier notifier = new Notifier(msg);
        new Thread(notifier,"notifier").start();
        System.out.println("Started all thread");

    }
}