package com.exampl.objectSwitch;

import java.util.Objects;

public class Task43 {
    //Проверка ссылок на null и возврат непустых ссылок, заданных по умолчанию

    public static void main(String[] args) {

    }

}
class Car2{
    private final String name;
    private final Color olor;

    public Car2(String name, Color olor) {
        this.name = Objects.requireNonNullElse(name,"no name");
        this.olor = Objects.requireNonNullElseGet(olor,() -> new Color());
    }
}
class Color2{

}