package com.exampl.guru.classes.finishWork;

import java.time.LocalTime;

public class TrainTest {
    public static void main(String[] args) {
        Train train1 = new Train("Москва", 5, LocalTime.of(17, 30));
        Train train2 = new Train("Питер", 3, LocalTime.of(10, 30));
        Train train3 = new Train("Псков", 1, LocalTime.of(15, 30));
        Train[] trains = {train1, train2, train3};
        for (Train train : Train.sortByNumber(trains,true)) {
            System.out.println(train);
        }

        for (Train train : Train.sortByDestinationAndTime(trains)) {
            System.out.println(train);
        }
    }
}
