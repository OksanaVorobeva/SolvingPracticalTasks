package com.exampl.guru.oop.flowers;

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

