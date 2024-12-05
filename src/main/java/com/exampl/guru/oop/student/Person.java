package com.exampl.guru.oop.student;

class Person extends Student {
    private Integer salary;

    public Person(Integer grant, Integer salary) {
        super(grant);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    int gerIncome(int grand) {
        return super.gerIncome(grand+getSalary());
    }
}