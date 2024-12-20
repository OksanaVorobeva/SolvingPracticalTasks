package com.exampl.objectSwitch;

import java.util.Objects;

public class Task44 {
    //Проверка индекса в интервале от 0 до длины

    public static void main(String[] args) {

    }
}
class Function{
    private static final int X_UPPER_BOUND = 11;
    private static final int Y_UPPER_BOUND = 16;
    private final int x;

    public Function(int x) {
     this.x= Objects.checkIndex(x, X_UPPER_BOUND);
    }

    public int xMinusY(int y) {
        Objects.checkIndex(y,x);
        return x - y;
    }

    public static  int oneMinusY(int y) {
       Objects.checkIndex(y,Y_UPPER_BOUND);
        return 1-y;
    }

}