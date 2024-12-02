package com.exampl.taskGuru.prt4;

public class HW {
    public static void main(String[] args) {

        //1
        String s = null;
        try {
            System.out.println(s.toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //2
        try {
            throw new MyException2("my Excepcion");
        } catch (MyException2 e) {
            System.out.println(e.getMessage());
        }

        try {
            print("Hello");
        } catch (MyException2 e) {
            e.getMessage();
        }
    }

    public static void print(String s) throws MyException2 {
        System.out.println(s);
    }

}

class MyException2 extends Exception {
    private String message;

    public MyException2(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

class Division {

    public Double divide(String... argument) {
        int result = Integer.parseInt(argument[0]);
        try {
            for (int i = 0; i < argument.length - 1; i++) {
                result /= Integer.parseInt(argument[i]);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return (double) result;
    }
}



class DivisionTest {
    public static void main(String[] args) {
        Division d = new Division();
        System.out.println(d.divide(new String[]{"1"}));
    }
}