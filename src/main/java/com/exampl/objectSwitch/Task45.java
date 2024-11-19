package com.exampl.objectSwitch;

import java.util.Objects;

public class Task45 {
    //Проверка подынтервала в интервае от 0 до длины
    public static void main(String[] args) {

    }
}
class Function2{
    private static final int N_UPPER_BOUND = 101;
    private final int n;

    public Function2(int n) {
        this.n = Objects.checkIndex(n, N_UPPER_BOUND);
    }

    public int yMinusX(int x, int y) {
        Objects.checkFromToIndex(x,y,n);
        return y - x;
    }
}