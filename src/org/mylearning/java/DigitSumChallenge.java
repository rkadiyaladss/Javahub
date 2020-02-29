package org.mylearning.java;

public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number>=10){
            int sum=0;
            System.out.println("number->"+number);
           while(number>0){
              System.out.println("out->"+number%10);
              sum+=number%10;
              System.out.println("out->"+number/10);
              number/=10;
            } return sum;
        }return -1;
    }
}
