package com.skrzymo;

public class BarkingDog {
    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if(barking == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else{
            return false;
        }
    }
}
