package com.exampl.guru.enamHw.food;



abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    abstract FoodType getFoodType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

