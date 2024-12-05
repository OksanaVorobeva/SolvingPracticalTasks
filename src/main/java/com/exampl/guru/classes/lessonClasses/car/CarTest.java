package com.exampl.guru.classes.lessonClasses.car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Lada");
        car.color = "red";
        car.engine = 1.6;
        car.fuelVolume = 45;
        car.fuelConsumption = 7.5;
        car.fueLevel = 30;
        System.out.println(car.getFullInfo());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Введите текущее положение ");
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    System.out.println("Введите куда едем ");
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    car.move(x1, y1, x2, y2);
                    break;
                case 2:
                    System.out.println("Сколько литров заправляем");
                    int l = scanner.nextInt();
                    car.refuel(l);
                    break;
                case 3:
                    System.out.println(car.getFullInfo());
                    break;
                default:
                    System.out.println();
            }
        }
    }
}
