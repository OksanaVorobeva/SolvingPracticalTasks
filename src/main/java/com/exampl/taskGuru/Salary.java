package com.exampl.taskGuru;


public interface Salary {
    int getSalary();
}
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
class Economist extends SalaryBasedOnRate{

    public Economist(int rate) {
        super(rate);
    }
}
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