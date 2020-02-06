package com.company;

public class FloatAndDouble {

    public static void main(String ... args){
        float myMinFloatNumber = Float.MIN_VALUE;
        float myMaxFloatNumber = Float.MAX_VALUE;

        double myMinDoubleNumber = Double.MIN_VALUE;
        double myMaxDoubleNumber = Double.MAX_VALUE;

        System.out.println("min float value is "+myMinFloatNumber);
        System.out.println("max float value is "+myMaxFloatNumber);
        System.out.println("min double value is "+myMinDoubleNumber);
        System.out.println("max float value is "+myMaxDoubleNumber);

        float floatTest = (float) 42.25;
        double doubleTest = 42.25;


        //challenge

        double weightInPounds = 5.25d;
        double weightInKg = weightInPounds * 0.45359237d;
        System.out.println(weightInKg);


    }
}
