package com.company;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        int x=9;
        int y=0;

        try {
            System.out.println(x / y);//Arithmetic Exception//runtime//shortcut ctrlAltT
            System.out.println("Try block");
        } catch (ArithmeticException e) {
            e.printStackTrace();
          //  System.out.println("Catch block");
        }

    }
}
