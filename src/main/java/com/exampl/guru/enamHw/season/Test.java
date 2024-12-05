package com.exampl.guru.enamHw.season;

public class Test {
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
