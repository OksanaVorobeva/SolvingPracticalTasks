package com.exampl.guru.oop.flowers2;

import java.time.LocalDateTime;

class Lily implements Flower {
    private int cost;
    private long lifeTimeInHours;
    private LocalDateTime deliveryDate;
    private String color;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public long getLifeTimeInHours() {
        return lifeTimeInHours;
    }

    @Override
    public void setLifeTimeInHours(long lifeTimeInHours) {
        this.lifeTimeInHours = lifeTimeInHours;
    }

    @Override
    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public LocalDateTime storageLife() {
        return deliveryDate.plusHours(lifeTimeInHours);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
