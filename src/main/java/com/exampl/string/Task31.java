package com.exampl.string;

public class Task31 {
    //Значение типа double float является
    //конечным значение с правающей точкой

    public static void main(String[] args) {
        float f = 3.14F;
        double d = 3.87;

//для числа одинарной точности
        System.out.println(Math.abs(f) <= Float.MAX_VALUE);
        //для числа двойной точности
        System.out.println(Math.abs(d) <= Double.MAX_VALUE);

        Float f1=4.5f;
        boolean f1f =Float.isFinite(f1); //является конечным
        System.out.println(f1f);

        Float f2 = f1/0; //не является конечным Infinity
        boolean f2f=Float.isFinite(f2);
        System.out.println(f2f);

        Float f3=0f/0f; //не является конечным NaN
        boolean f3f =Float.isFinite(f3);
        System.out.println(f3f);

        Double d1 =0.000333411333d;
        boolean d1f =Double.isFinite(d1); //является конечным
        System.out.println(d1f);

        Double d2=d1/0;
        boolean d2f =Double.isFinite(d2); //не является конечным Infinity
        System.out.println(d2f);

        Double d3=Double.POSITIVE_INFINITY*0;
        boolean d3f =Double.isFinite(d3); //не является конечным NaN
        System.out.println(d3f);



    }
}
