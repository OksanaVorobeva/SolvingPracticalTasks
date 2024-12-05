package com.exampl.guru.oop.flowers2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public interface Flower {
    int getCost();

    void setCost(int cost);

    long getLifeTimeInHours();

    void setLifeTimeInHours(long lifeTimeInHours);

    LocalDateTime getDeliveryDate();

    void setDeliveryDate(LocalDateTime deliveryDate);

    LocalDateTime storageLife();

    String getColor();

    void setColor(String color);
}


