package com.exampl.taskGuru.prt2.flowers2;

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

class Orchid implements Flower {
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
class Bouquet{
    private ArrayList<Flower> bouquet= new ArrayList<>();

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    protected ArrayList<Flower> collectBouquet(Flower flower){
        if (flower!=null){
            bouquet.add(flower);
        }
        return bouquet;
    }

    protected int calcCost(){
        int cost=0;
        for (int i = 0; i < bouquet.size(); i++) {
            cost+=bouquet.get(i).getCost();
        }
        return cost;
    }
    protected String determineColors(){
        String enumColors="";
        for (int i = 0; i < bouquet.size(); i++) {
            enumColors += bouquet.get(i).getColor()+", ";
        }
        return enumColors;
    }

    LocalDateTime determineWiltingPeriod(){
        bouquet.trimToSize();
        LocalDateTime[] localTimes = new LocalDateTime[bouquet.size()];
        int counter=0;
        for (int i = 0; i < localTimes.length; i++) {
            if (bouquet.get(i)!=null&&bouquet.get(i).storageLife()!=null) {
                localTimes[i]=bouquet.get(i).storageLife();
                counter++;
            }
        }
        localTimes= Arrays.copyOf(localTimes, counter);
        LocalDateTime max=localTimes[0];
        for (int i = 1; i < localTimes.length; i++) {
            if (localTimes[i].isAfter(max)) {
                max = localTimes[i];
            }
        }
        return max;
    }
}
