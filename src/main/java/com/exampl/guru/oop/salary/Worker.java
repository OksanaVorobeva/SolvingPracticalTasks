package com.exampl.guru.oop.salary;
class Worker extends SalaryBasedOnHours{
    private int bonus;

    public Worker(int workingHours, int cost, int bonus) {
        super(workingHours, cost);
        this.bonus = bonus;
    }


    @Override
    public int getSalary() {
        return super.getSalary()+bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}