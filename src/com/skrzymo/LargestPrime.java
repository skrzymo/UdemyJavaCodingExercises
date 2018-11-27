package com.skrzymo;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        int largestPrime = 0;
        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                for(int j = 2; j <= i; j++) {
                    if(i % j == 0) {
                        break;
                    } else if(number % j == 0) {
                        largestPrime = i;
                    }
                }
                if(largestPrime == 0 && (i == 2 || i == 3 || i == 5 || i ==7 || i == number)) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}
