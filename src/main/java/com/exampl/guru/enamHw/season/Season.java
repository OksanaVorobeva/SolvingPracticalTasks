package com.exampl.guru.enamHw.season;
public enum Season {
    SUMMER("good", 90),
    AUTUMN("so-so", 90),
    WINTER("bad", 90),
    SPRING("so-so", 90);


    private String description;
    private int countOfDay;

    Season(String description, int countOfDay) {
        this.description = description;
        this.countOfDay = countOfDay;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDay() {
        return countOfDay;
    }

}