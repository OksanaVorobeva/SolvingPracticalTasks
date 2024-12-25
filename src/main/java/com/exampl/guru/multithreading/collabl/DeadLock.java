package com.exampl.guru.multithreading.collabl;

public class DeadLock {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void  bow(Friend friend) {
            System.out.println(this.name + " bow " + friend.getName());
            friend.bowBack(this);
        }

        public synchronized void bowBack(Friend friend) {
            System.out.println(this.name + " bowBack " + friend.getName());
        }
    }

    public static void main(String[] args) {
        final Friend friend1 = new Friend("Bob");
        final Friend friend2 = new Friend("Alice");
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 1");
                friend1.bow(friend2);
                System.out.println("friend 1  bowed friend 2");
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 2");
                friend2.bow(friend1);
                System.out.println("friend 2  bowed friend 1");
            }
        }).start();
    }
}
