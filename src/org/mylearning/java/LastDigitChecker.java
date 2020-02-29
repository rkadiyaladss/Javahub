package org.mylearning.java;

public class LastDigitChecker {

   public static boolean isValid(int a)
   {
       if((a<10 || a>1000)){
           return false;
       }
       return true;
    }
    public static boolean hasSameLastDigit(int a,int b,int c){
        int x1=0;
        int x2=0;
        int x3=0;
        if ((!isValid(a) || !isValid(b) || !isValid(c))) return false;
        x1=a%10;
        x2=b%10;
        x3=c%10;
        if((x1==x2)||(x1==x3)||(x2==x3)) return true;
        return false;
    }
}
