package com.exampl.string;

public class Task19 {
    //Обьединение многострочных строковых литералов
 private static final String LS = System.lineSeparator();
    public static void main(String[] args) {
       // String text =String.join(LS, "Моя школаб Иллинойская Академия,",
                //"математики и естественных наук");
       // String text ="Моя школаб Иллинойская Академия," +LS + "математики и естественных наук";
        String text = String.format("%s" +LS +"%s"+LS ,"Моя школаб Иллинойская Академия,",
                "математики и естественных наук");
        System.out.println(text);
    }
}
