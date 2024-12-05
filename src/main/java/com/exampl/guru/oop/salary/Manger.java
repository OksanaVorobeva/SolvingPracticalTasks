package com.exampl.guru.oop.salary;
class Manger extends SalaryBasedOnRate{
    private int bonus;

    public Manger(int rate, int bonus) {
        super(rate);
        this.bonus = bonus;
    }

    public Manger(int rate) {
        this(rate, 0);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}