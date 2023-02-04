package com.company;

public class Arithmetic_Exception {
    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);//Arithmetic Exception//runtime//shortcut ctrlAltT
            System.out.println("Try block");
        } catch (ArithmeticException e) {
         //   e.printStackTrace();
            System.out.println("Catch block");
        }

    }
}
