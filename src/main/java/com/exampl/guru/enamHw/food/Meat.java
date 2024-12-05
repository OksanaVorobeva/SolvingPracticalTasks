package com.exampl.guru.enamHw.food;

class Meat extends Food {

    public Meat(String name) {
        super(name);
    }

    @Override
    FoodType getFoodType() {
        return FoodType.MEAT;
    }
}