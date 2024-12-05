package com.exampl.guru.enamHw.food;
class Fruit extends Food {

    public Fruit(String name) {
        super(name);
    }

    @Override
    FoodType getFoodType() {
        return FoodType.FRUIT;
    }
}
