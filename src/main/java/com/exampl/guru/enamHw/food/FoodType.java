package com.exampl.guru.enamHw.food;

public enum FoodType {
    PORRIDGE(true), BREAD(true), SOUP(false), VEGETABLE(true),
    NUT(true), FRUIT(true), DAIRY(false),
    FISH(false), GREENS(true), MEAT(false), UNKNOWN(false);

    private boolean isVegetarian;

    FoodType(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}