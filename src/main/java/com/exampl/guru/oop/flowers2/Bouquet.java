package com.exampl.guru.oop.flowers2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

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