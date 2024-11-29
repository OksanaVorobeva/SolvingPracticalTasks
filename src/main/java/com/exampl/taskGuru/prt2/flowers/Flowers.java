package com.exampl.taskGuru.prt2.flowers;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.time.LocalTime.of;

public class Flowers {
    private double cost;
    private String arriveDate;
    private int shelLife;
    private String color;

    public Flowers(double cost, String arriveDate, int shelLife, String color) {
        this.cost = cost;
        this.arriveDate = arriveDate;
        this.shelLife = shelLife;
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public int getShelLife() {
        return shelLife;
    }

    public void setShelLife(int shelLife) {
        this.shelLife = shelLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Roses extends Flowers {

    public Roses(double cost, String arriveDate, int shelLife, String color) {
        super(cost, arriveDate, shelLife, color);
    }
}

class Carnations extends Flowers {

    public Carnations(double cost, String arriveDate, int shelLife, String color) {
        super(cost, arriveDate, shelLife, color);
    }
}

class Tulips extends Flowers {
    public Tulips(double cost, String arriveDate, int shelLife, String color) {
        super(cost, arriveDate, shelLife, color);
    }
}

class Bouquet {
    private Flowers[] flowers;
    private int count;

    public Bouquet(int size) {
        flowers = new Flowers[size];
        count = 0;
    }

    public void addFlower(Flowers flower) {
        if (count < flowers.length) {
            flowers[count] = flower;
            count++;
        }else {
            System.out.println("Bouquet is full");
        }

    }

    public double getBouquetCost() {
        double totalCost = 0.0;
        for (int i = 0; i < count; i++) {
            totalCost += flowers[i].getCost();
        }
        return totalCost;
    }

    public String[] getAllColors() {
        String[] colors = new String[count];
        for (int i = 0; i < count; i++) {
            colors[i] = flowers[i].getColor();
        }
        return colors;
    }

    public String getWitheredDate() {
        int maxShelfLife = 0;
        for (int i = 0; i < count; i++) {
            int remainingShelfLife = flowers[i].getShelLife() - getDaysSinceArrival(flowers[i]);
            maxShelfLife = Math.max(maxShelfLife, remainingShelfLife);
        }
        int witheredDays = maxShelfLife;
        int witheredDate = getToday() + witheredDays;
        int witheredMonth = (witheredDate / 30) + 1;
        int witheredDay = (witheredDate % 30) + 1;

        return witheredMonth + "/" + witheredDay;
    }

    private int getToday() {
        return 0;
    }

    private int getDaysSinceArrival(Flowers flower) {
        return 0;
    }
}


class Test2 {
    public static void main(String[] args) {

        Roses roses1 = new Roses(300, "2024-07-01", 7, "red");
        Roses roses2 = new Roses(250, "2024-07-02", 5, "red");
        Carnations carnations1 = new Carnations(150, "2024-07-03", 7, "pink");
        Tulips tulips1 = new Tulips(110, "2024-07-04", 6, "yellow");
        Bouquet bouquet = new Bouquet(10);
        bouquet.addFlower(roses1);
        bouquet.addFlower(roses2);
        bouquet.addFlower(tulips1);
        bouquet.addFlower(carnations1);

        System.out.println("Cost: " + bouquet.getBouquetCost());

        String[] colors =bouquet.getAllColors();
        for (String color : colors) {
            System.out.println(color);
        }

        String witheredDate = bouquet.getWitheredDate();
        System.out.println(witheredDate);

    }
}