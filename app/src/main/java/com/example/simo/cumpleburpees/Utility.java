package com.example.simo.cumpleburpees;

/**
 * Created by Simo on 11/8/15.
 */
public class Utility {

    public int BurpeeNumber(int age){
        int burpee=0;
        if (age <= 36){
            while (age > 0){
                burpee += age;
                age -=1;
            }
        }else{
            burpee=666;
        }
        return burpee;
    }

    public int DU(int age){
        int DU=0;
        while (age>36){
            DU+=age;
            age -= 1;
        }
        return DU;
    }
}
