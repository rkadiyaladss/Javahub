package org.mylearning.java;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int i=1;
        int sum=0;
        if(number<1) return false;
        while (i<number){
            if(number%i==0) sum+=i;
            i++;
        }
        if (number==sum)return true;
        return false;
    }
}