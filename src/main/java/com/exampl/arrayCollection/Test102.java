package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Comparator;

public class Test102 {
    //Сравнение двух массивов лексиграфически
    public static void main(String[] args) {
        int[] integers1 = {3, 4, 5, 6, 1, 5};
        int[] integers2 = {3, 4, 5, 6, 1, 5};
        int[] integers3 = {3, 4, 5, 6, 1, 3};

        int i12= Arrays.compare(integers1, integers2);
        System.out.println(i12);
        int i13 = Arrays.compare(integers1,3,6, integers3,3,6);
        System.out.println(i13);

        Melon[] melons1 =
                {new Melon("Horned", 1500), new Melon("Gac", 1000),};

        Melon[] melons2 =
                {new Melon("Horned", 1500), new Melon("Gac", 1000),};

        Melon[] melons3 =
                {new Melon("Hami", 1600), new Melon("Gac", 800),};

        int m12=Arrays.compare(melons1,melons2);
        System.out.println(m12);
        int m13 = Arrays.compare(melons1,1,2,melons3,1,2);
        System.out.println(m13);
        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        int mt13 =Arrays.compare(melons1,1,2,melons3,1,2,byType);
        System.out.println(mt13);

    }
}
