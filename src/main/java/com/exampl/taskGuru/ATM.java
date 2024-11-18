package com.exampl.taskGuru;

import java.util.Random;
import java.util.Scanner;

public class ATM {
    private int twenty;
    private int fifty;
    private int oneHundred;
    private int allMoney;

    public ATM(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }


    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getOneHundred() {
        return oneHundred;
    }

    public void setOneHundred(int oneHundred) {
        this.oneHundred = oneHundred;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    @Override
    public String toString() {
        return "ATM{" +
               "twenty=" + twenty +
               ", fifty=" + fifty +
               ", oneHundred=" + oneHundred +
               '}';
    }

    public int addMoney() {
        setAllMoney(getOneHundred() * 100 + getFifty() * 50 + getTwenty() * 20);
        return getAllMoney();
    }

    public void takeMoney(int sum) {
        if (getAllMoney() < sum) {
            System.out.println("Мало денег в банкомате");
        } else {
            if (sum % 10 != 0) {
                System.out.println("Невозможно получить данную сумму,купюры только 100 50 20");
            } else {
                int amountOneHundred = sum / 100;
                int amountFifty = (sum - amountOneHundred * 100) / 50;
                int amountTwenty = (sum - amountOneHundred * 100 - amountFifty * 50) / 20;
                System.out.println("Кол-во 100:  " + amountOneHundred + "  Кол-во 50:  " + amountFifty + "  Кол-во 20: " + amountTwenty);
                setAllMoney(getAllMoney() - sum);
            }
        }
    }


    public static void main(String[] args) {
        ATM atm = new ATM(1, 1, 1);
        atm.addMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int sum2 = scanner.nextInt();
        atm.takeMoney(sum2);
        System.out.println(atm.getAllMoney());

    }
}
