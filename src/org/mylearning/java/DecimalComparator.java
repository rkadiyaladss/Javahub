package org.mylearning.java;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = a * 1000;
        b = b * 1000;
        System.out.println(a);
        System.out.println(b);
        int a1 = (int) a;
        int b1 = (int) b;
        System.out.println(a1);
        System.out.println(b1);
        if (a1 == b1) {
            return true;
        } else
        return false;
    }
}
