package com.skrzymo;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if(x < 10 || y < 10 || z < 10 || x > 1000 || y > 1000 || z > 1000) {
            return false;
        }
        x %= 10;
        y %= 10;
        z %= 10;
        if(x == y){
            return true;
        } else if(x == z){
            return true;
        } else if(y == z){
            return true;
        } else {
            return false;
        }
    }
}
