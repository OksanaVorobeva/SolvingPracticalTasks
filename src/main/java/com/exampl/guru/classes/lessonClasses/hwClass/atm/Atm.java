package com.exampl.guru.classes.lessonClasses.hwClass.atm;

public class Atm {
    private int byn100;
    private int byn50;
    private int byn20;
    private int totalByn;

    public Atm(int byn100, int byn50, int byn20) {
        this.byn100 = byn100;
        this.byn50 = byn50;
        this.byn20 = byn20;
    }

    void addMoney(int addByn100, int addByn50, int addByn20) {
        byn100 += addByn100;
        byn50 += addByn50;
        byn20 += addByn20;
        totalByn = byn100 * 100 + byn50 * 50 + byn20 * 20;
    }

    void withdraw(int n) {
        int exitByn20 = 0;
        int exitByn50 = 0;
        int exitByn100 = 0;
        int sum = n;
        if (n <= totalByn && n % 10 == 0) {
            if (n == 10 || n == 30) {
                System.out.println("Не существуют купюры " + n);
                return;
            }
            if (n / 100 != 0 && n % 100 == 10 && byn20 >= 3 && byn50 >= 1) {
                n = n - 110;
                exitByn50 = 1;
                byn50 = byn50 - exitByn50;
                exitByn20 = 3;
                byn20 = byn20 - exitByn20;
            } else if (n / 100 != 0 && n % 100 == 10) {
                System.out.println("Not enough money");
            }
            if (n / 100 != 0 && n % 100==30&&byn20 >= 4 && byn50 >= 1) {
                n = n - 130;
                exitByn50 = 1;
                byn50 = byn50 - exitByn50;
                exitByn20 = 3;
                byn20 = byn20 - exitByn20;
            }
        }

    }
}
