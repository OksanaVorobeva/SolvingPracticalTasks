package com.exampl.objectSwitch;

public class Task50 {
    //Передача мутируемых обьектов
    //в немутируемый клвсс
    //и возврат мутируемых обьектов в него

    public static void main(String[] args) {
        Radius radius = new Radius();
        radius.setStarts(0);
        radius.setEnds(120);

        Point p = new Point(1.23,4.12,radius);

        System.out.println(p.getRadius().getStarts());
        p.getRadius().setStarts(5);
        System.out.println(p.getRadius().getStarts());
    }
}
 class Radius{
    private int starts;
    private int ends;

     public int getStarts() {
         return starts;
     }

     public void setStarts(int starts) {
         this.starts = starts;
     }

     public int getEnds() {
         return ends;
     }

     public void setEnds(int ends) {
         this.ends = ends;
     }
 }

 final class Point{
    private final double x;
    private final double y;
    private final Radius radius;

     public Point(double x, double y, Radius radius) {
         this.x = x;
         this.y = y;

         Radius clone=new Radius();
         clone.setStarts(radius.getStarts());
         clone.setEnds(radius.getEnds());
         this.radius = clone;
     }

     public double getX() {
         return x;
     }

     public double getY() {
         return y;
     }

     public Radius getRadius() {
         Radius clone=new Radius();
         clone.setStarts(this.radius.getStarts());
         clone.setEnds(this.radius.getEnds());
         return clone;
     }
 }