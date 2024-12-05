package com.exampl.guru.oop.salary;

class SalaryBasedOnRate implements Salary {
    private int rate;

    public SalaryBasedOnRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getSalary() {
        return rate;
    }
}
