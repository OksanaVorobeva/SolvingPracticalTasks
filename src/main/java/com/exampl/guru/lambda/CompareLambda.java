package com.exampl.guru.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"ad"};
        String [] s3 = new String[]{"acza", "bsff"};

        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        arrayList.sort((Comparator.comparingInt(o -> o.length)));

        for (String[] arr : arrayList) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
