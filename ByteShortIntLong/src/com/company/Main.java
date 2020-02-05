package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("min value is "+ myMinIntValue);
        System.out.println("max value is "+myMaxIntValue);
        System.out.println("busted min value is "+(myMinIntValue-1));
        System.out.println("busted max value is "+(myMaxIntValue+1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("min value is "+ myMinByteValue);
        System.out.println("max value is "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("min value is "+ myMinShortValue);
        System.out.println("max value is "+myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("min value is "+ myMinLongValue);
        System.out.println("max value is "+myMaxLongValue);

        

    }
}
