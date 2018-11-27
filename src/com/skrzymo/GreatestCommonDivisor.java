package com.skrzymo;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestDivisor = 1;
        if (second < first) {
            for (int i = 2; i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestDivisor = i;
                }
            }
        } else {
            for (int i = 2; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestDivisor = i;
                }
            }
        }
        return greatestDivisor;
    }
}
