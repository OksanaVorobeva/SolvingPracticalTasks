package com.exampl.guru.enamHw.food;
class Nut extends Food {

    public Nut(String name) {
        super(name);
    }

    @Override
    FoodType getFoodType() {
        return FoodType.NUT;
    }
}
