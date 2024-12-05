package com.exampl.guru.oop.flowers;


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






