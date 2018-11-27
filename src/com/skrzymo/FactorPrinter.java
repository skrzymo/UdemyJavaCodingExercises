package com.skrzymo;

public class FactorPrinter {

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("All factors of tne number " + number);
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
