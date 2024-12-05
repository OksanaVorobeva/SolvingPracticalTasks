package com.exampl.guru.classes.lessonClasses.hwClass.phone;

public class TestPhone {
    public static void main(String[] args) {

        Phone nokia =new Phone("2222222","АЗ",0.2);
        Phone simens =new Phone("333333","sasss",0.3);
        System.out.println(nokia);
        System.out.println(simens);

        nokia.receiveCall("Anton");
        nokia.receiveCall("Anton","kkkkk");
    }
}
