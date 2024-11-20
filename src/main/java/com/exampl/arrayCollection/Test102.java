package com.exampl.arrayCollection;

import java.util.Arrays;

public class Test102 {
    //Сравнение двух массивов лексиграфически
    public static void main(String[] args) {
        int[] integers1 = {3, 4, 5, 6, 1, 5};
        int[] integers2 = {3, 4, 5, 6, 1, 5};
        int[] integers3 = {3, 4, 5, 6, 1, 3};

        int i12= Arrays.compare(integers1, integers2);
        System.out.println(i12);
        int i13 = Arrays.compare(integers1, integers3);
        System.out.println(i13);
    }
}
