package com.exampl.guru.oop.salary;
class TestSalary{
    public static void main(String[] args) {
        Worker worker =new Worker(160,10,200);
        System.out.println(worker.getSalary());
        Salary manger=new Manger(2000);
        System.out.println(manger.getSalary());
        SalaryBasedOnRate economist=new Economist(5000);
        System.out.println(economist.getSalary());
    }
}