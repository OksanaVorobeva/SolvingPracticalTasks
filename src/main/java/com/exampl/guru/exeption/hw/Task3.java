package com.exampl.guru.exeption.hw;

public class Task3 {
    public static void main(String[] args) {
        try {
            generateExeption();
        } catch (MyException2 e) {
            System.out.println(e.getMessage());
        }
    }

    private static void generateExeption() throws MyException2{
        throw new MyException2("This is a test");
    }
}
class MyException2 extends  Exception {
    private String msg;
    public MyException2(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
