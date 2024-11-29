package com.exampl.taskGuru.prt2.user2;

 abstract class User2 {
     String name;
    abstract  int getIncome();
}

 class Student2 extends User2 {

    private Integer grant;

    public Student2(Integer grant) {
        this.grant = grant;
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }

    @Override
    int getIncome() {
        return 0;
    }

    int gerIncome(int grand){
        return grand+getGrant();
    }
}

class Person extends Student2 {
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

