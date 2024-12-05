package com.exampl.guru.exeption.hw;

public class Task2 {
    public static void main(String[] args) {
        try{
            throw new MyException("Exeption");
        }  catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}

class MyException extends Exception {
    private String msg;
    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}