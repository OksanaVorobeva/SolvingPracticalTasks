package com.exampl.guru.classes.lessonClasses.hwClass.phone;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void  receiveCall(String name){
        System.out.println("Calling " + name);
    }

    public void  receiveCall(String name,String number){
        System.out.println("Calling " + name+" with " + number);
    }

    public void sendMessage(String[] number){
        for (String s : number) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
               "number='" + number + '\'' +
               ", model='" + model + '\'' +
               ", weight=" + weight +
               '}';
    }
}
