package com.exampl.guru.oop.salary;

class SalaryBasedOnHours implements Salary {
    private int workingHours;
    private int cost;

    public SalaryBasedOnHours(int workingHours, int cost) {
        this.workingHours = workingHours;
        this.cost = cost;
    }
    @Override
    public int getSalary() {
        return workingHours * cost;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
