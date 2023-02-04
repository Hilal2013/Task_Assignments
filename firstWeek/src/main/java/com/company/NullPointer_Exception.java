package com.company;

public class NullPointer_Exception {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toLowerCase());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
