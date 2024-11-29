package com.exampl.taskGuru.prt2.food;

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


class Fruit extends Food {

    public Fruit(String name) {
        super(name);
    }

    @Override
    FoodType getFoodType() {
        return FoodType.FRUIT;
    }
}

class Meat extends Food {

    public Meat(String name) {
        super(name);
    }

    @Override
    FoodType getFoodType() {
        return FoodType.MEAT;
    }
}

class Nut extends Food {

    public Nut(String name) {
        super(name);
    }

    @Override
    FoodType getFoodType() {
        return FoodType.NUT;
    }
}


class Test7 {
    public static void main(String[] args) {
        Meat meat = new Meat("свинья");
        Fruit fruit1 = new Fruit("яблоко");
        Fruit fruit2 = new Fruit("груша");
        Nut nut = new Nut("миндаль");

        printFood(meat);
        printFood(fruit1);
        printFood(fruit2);
        printFood(nut);

        Food[] foodVegan=new Food[]{fruit1,fruit2,nut};
        Food[] foodNoVegan=new Food[]{meat};

        System.out.println(printFoods(foodVegan)+isVegerarian(foodVegan));
        System.out.println(printFoods(foodNoVegan)+isVegerarian(foodNoVegan));


    }

    public static boolean isVegerarian(Food[] foods) {
        for (Food food : foods) {
            if (!food.getFoodType().isVegetarian()) {
                return false;
            }
        }
        return true;
    }

    public static void printFood(Food food) {
        System.out.println(food.getName() + " " + food.getFoodType());
    }

    public static String printFoods(Food[] foods) {
        String str ="";
        for (Food food : foods) {
            str += food.getName() + " ";
        }
        return str;
    }
}


