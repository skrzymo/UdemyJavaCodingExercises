package com.skrzymo;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if(x < 10 || x > 99 || y < 10 || y > 99){
            return false;
        }
        int lastDigitX = x % 10;
        int lastDigitY = y % 10;
        x /= 10;
        y /= 10;
        if(x == lastDigitY) {
            return true;
        } else if(x == y) {
            return true;
        } else if(y == lastDigitX) {
            return true;
        } else {
            return false;
        }
    }
}
