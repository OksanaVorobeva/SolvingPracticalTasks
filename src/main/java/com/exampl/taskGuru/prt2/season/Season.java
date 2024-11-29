package com.exampl.taskGuru.prt2.season;

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

class Test6 {
    public Season season1;

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name());
        }
    }

    public static Season getNextSeasons(String name) {
        int seasonNum = Season.valueOf(name).ordinal();
        int result = seasonNum == Season.values().length - 1 ? 0 : seasonNum + 1;
        return Season.values()[result];
    }
}


