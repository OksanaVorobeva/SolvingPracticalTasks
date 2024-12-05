package com.exampl.guru.enamHw.food;

public class Test {
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
