package com.exampl.guru.classes.finishWork;

import java.time.LocalTime;

public class Train {
    private String destination;
    private int number;
    private LocalTime departureTime;

    public Train(String destination, int number, LocalTime departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public Train() {
    }

    @Override
    public String toString() {
        return "Train{" +
               "destination='" + destination + '\'' +
               ", number=" + number +
               ", departureTime=" + departureTime +
               '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public static void print(Train[] train, int number) {
        for (int i = 0; i < train.length; i++) {
            if (number == train[i].getNumber()) {
                System.out.println("Номер " + train[i].getNumber() + " Пункт назначения " + train[i].getDestination()
                                   + " Время отправления " + train[i].getDepartureTime());
            }
        }
    }

    public static Train[] sortByNumber(Train[] train,boolean isDesc) {
      boolean sorted = false;
      Train temp;
      while (!sorted) {
          sorted = true;
          for (int i = 0; i < train.length-1; i++) {
              boolean check = isDesc?
                      train[i].getNumber()>train[i+1].getNumber():
                      train[i].getNumber()<train[i+1].getNumber();
              if (check) {
                  temp = train[i];
                  train[i] = train[i+1];
                  train[i+1] = temp;
                  sorted = false;
              }
          }
      }
      return train;
    }

    public static Train[] sortByDestinationAndTime(Train[] train) {
        boolean sorted = false;
        Train temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < train.length-1; i++) {
                if (train[i].getDestination().compareTo(train[i+1].getDestination()) > 0 ||
                    (train[i].getDestination().compareTo(train[i+1].getDestination())==0 &&
                     train[i].getDepartureTime().isAfter(train[i+1].getDepartureTime())))
                {
                    temp = train[i];
                    train[i] = train[i+1];
                    train[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return train;
    }
}

