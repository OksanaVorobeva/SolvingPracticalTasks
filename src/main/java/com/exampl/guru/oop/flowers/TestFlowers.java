package com.exampl.guru.oop.flowers;

public class TestFlowers {
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
