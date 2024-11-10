package com.exampl.string;

public class Task7 {
    //Конвертирование строки
    //в значение типа int,long,float,double

    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLET = "13.83423D";
    private static final String WRONG_NUMBER = "452w";


    public static void main(String[] args) {
        int toInt = Integer.parseInt(TO_INT);
        long toLong = Long.parseLong(TO_LONG);
        float toFloat = Float.parseFloat(TO_FLOAT);
        double toDouble = Double.parseDouble(TO_DOUBLET);

        Integer toInt2 = Integer.valueOf(TO_INT);
        Long toLong2 = Long.valueOf(TO_LONG);
        Float toFloat2 = Float.valueOf(TO_FLOAT);
        Double toDouble2 = Double.valueOf(TO_DOUBLET);

        try {
            Integer toIntWrong = Integer.valueOf(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
