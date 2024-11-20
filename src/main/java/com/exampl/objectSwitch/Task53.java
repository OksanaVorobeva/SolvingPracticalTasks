package com.exampl.objectSwitch;

import com.google.gson.Gson;

import java.io.*;

public class Task53 {
    //Клонирование обьектов

    //Клонирование по средствам библиотеки
   // Cloner cloner = new Cloner;

    public static void main(String[] args) {

    }


}
 class Point2 implements Cloneable{
    private double x;
    private double y;

    public Point2() {
    }

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //клонирование посредством конструктора
    public Point2(Point2 another){
        this.x = another.x;
        this.y = another.y;

    }

    //клонирование методом
     @Override
     protected Point2 clone() throws CloneNotSupportedException {
         return (Point2) super.clone();
     }

     public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Клонирование ручное
    public Point2 clonePoint(){
        Point2 point2 = new Point2();
        point2.setX(this.x);
        point2.setY(this.y);
        return point2;
    }

    //клонирование по срелствам сериализации

     private static <T> T cloneThroughSerialization(T t){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(t);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            return (T) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return t;
     }

     //Клонирование посредством JSON

     private static <T> T cloneThroughJson(T t){
        Gson gson=new Gson();
        String json=gson.toJson(t);
        return (T) gson.fromJson(json,t.getClass());
     }
}

