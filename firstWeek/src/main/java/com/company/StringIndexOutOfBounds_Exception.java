package com.company;

public class StringIndexOutOfBounds_Exception {
    public static void main(String[] args) {
        String str="Java";
        char ch= 0;
        try {
            ch = str.charAt(250);
        } catch (RuntimeException e) {
            e.getMessage();
        }
        //during compile time no error it compiles//after running exceptinon unchecked exception

         System.out.println(ch);//StringIndexOutOfBoundsException
    }
}
