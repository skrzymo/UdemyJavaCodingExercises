package com.skrzymo;

public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int difference = getDigitCount(number) - getDigitCount(reversedNumber);
        while(reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
        for(int i = 1; i <= difference; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while(number != 0) {
            reversedNumber += number % 10;
            reversedNumber *= 10;
            number /= 10;
        }
        reversedNumber /= 10;
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int counter = 0;
        while(number > 0) {
            number /= 10;
            counter ++;
        }
        return counter;
    }
}
