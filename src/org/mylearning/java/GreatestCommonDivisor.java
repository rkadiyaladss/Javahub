package org.mylearning.java;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        int smallest=0;
        int gcd=0;
        if(first<10 || second<10) return -1;
        if (first<second) {
            smallest=first;
        } smallest=second;
        for(int i = 1; i <= smallest; i++)
        {
            if(first % i==0 && second % i==0)
                gcd = i;
        }
        return gcd;
    }
}
