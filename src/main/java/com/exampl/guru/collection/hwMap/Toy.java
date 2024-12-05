package com.exampl.guru.collection.hwMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Toy {
    String name;
    int age;
    int price;

    Toy(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", price=" + price +
               '}';
    }
}

class Test{
    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        Toy car= new Toy("Car", 3, 100);
        Toy doll = new Toy("Doll", 3, 200);
        toyMap.put(car.name, car);
        toyMap.put(doll.name, doll);

        for (Map.Entry<String, Toy> item : toyMap.entrySet()) {
            System.out.println(item);
        }

        Set<String> entrySet = toyMap.keySet();
        System.out.println(entrySet);
        Collection<Toy> toys = toyMap.values();
        System.out.println(toys);
    }
}
