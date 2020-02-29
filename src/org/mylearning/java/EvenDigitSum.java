package org.mylearning.java;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int firstDigit=number;
        int lastDigit=number%10;
        int evenDigitSum=0;
        if(number<0){
            return -1;
        }
        while (firstDigit >0) {
            lastDigit=firstDigit%10;
            firstDigit = firstDigit/10;
            if(lastDigit%2==0){
                evenDigitSum+=lastDigit;
            }
         }
       return evenDigitSum;
    }
}
