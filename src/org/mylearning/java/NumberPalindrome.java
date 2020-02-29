package org.mylearning.java;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalnumber = number;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
         if (reverse == originalnumber) {
            return true;
        }
        return false;
    }
}
