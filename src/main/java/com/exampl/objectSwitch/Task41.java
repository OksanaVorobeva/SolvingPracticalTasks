package com.exampl.objectSwitch;

import java.awt.*;
import java.util.Objects;

public class Task41 {
    //Проверка ссылок на null и выбрасывание собственного исключения

    public static void main(String[] args) {

    }

}
 class Car{
    private final String name;
    private final Color color;
    public Car(String name, Color color) {
        this.name = Objects.requireNonNull(name,"Имя автомобиля не может быть null" );
        this.color = Objects.requireNonNull(color, "Цвет автомобиля не может быть null");
    }

    public void assignDriver(String license,Point location){
        Objects.requireNonNull(license,"Лицензия не может быть null");
        Objects.requireNonNull(location,"Местоположение не может быть null");
    }

}

class Color{
    private String color;
}
