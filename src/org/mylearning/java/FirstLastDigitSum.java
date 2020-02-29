package org.mylearning.java;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int firstDigit=0;
        int lastDigit=0;
        if(number<0){
            return -1;
        }
        firstDigit=number;
        lastDigit=number%10;
        while (firstDigit >= 10) {
            firstDigit = firstDigit/10;
        }
         return firstDigit+lastDigit;
    }
}
