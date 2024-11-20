package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Comparator;

public class Task101 {
    //Проверка эквивалентности или несовпадения двух массивов

    public static void main(String[] args) {
        int[] integers1 = {3, 4, 5, 6, 1, 5};
        int[] integers2 = {3, 4, 5, 6, 1, 5};
        int[] integers3 = {3, 4, 5, 6, 1, 3};

        boolean i12 = Arrays.equals(integers1, integers2);
        System.out.println(i12);
        boolean i13 = Arrays.equals(integers1, 1, 4, integers3, 1, 4);
        System.out.println(i13);

        int mi12 = Arrays.mismatch(integers1, integers2);
        System.out.println(mi12);
        int mi13 = Arrays.mismatch(integers1, integers3);
        System.out.println(mi13);

        Melon[] melons1 =
                {new Melon("Horned", 1500), new Melon("Gac", 1000),};

        Melon[] melons2 =
                {new Melon("Horned", 1500), new Melon("Gac", 1000),};

        Melon[] melons3 =
                {new Melon("Homi", 1500), new Melon("Gac", 1000),};

        boolean m12 = Arrays.equals(melons1, melons2);
        System.out.println(m12);
        boolean m13 = Arrays.equals(melons1, 1, 2, melons3, 1, 2);
        System.out.println(m13);

        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);

        boolean mw13 = Arrays.equals(melons1, melons3, byWeight);
        System.out.println(mw13);
        boolean mt13 = Arrays.equals(melons1, melons3, byType);
        System.out.println(mt13);
        boolean mrt = Arrays.equals(melons1, 1, 2, melons3, 1, 2, byType);

        int mm12 = Arrays.mismatch(melons1, melons2);
        System.out.println(mm12);
        int mm13 = Arrays.mismatch(melons1, melons3);
        System.out.println(mm13);

        int mms13 = Arrays.mismatch(melons1, 1, 2, melons3, 1, 2);
        System.out.println(mms13);
        int mmw13 = Arrays.mismatch(melons1, melons3, byWeight);
        System.out.println(mmw13);
        int mmt13 = Arrays.mismatch(melons1, melons3, byType);
        System.out.println(mmt13);
        int mmrt13 = Arrays.mismatch(melons1, 1, 2, melons3, 1, 2, byType);
        System.out.println(mmrt13);

    }
}
