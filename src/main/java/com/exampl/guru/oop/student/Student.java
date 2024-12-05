package com.exampl.guru.oop.student;

class Student extends User {

    private Integer grant;

    public Student(Integer grant) {
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