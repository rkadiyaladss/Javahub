package org.mylearning.java;

public class SharedDigit {
    public static boolean hasSharedDigit(int a,int b){
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        if((a<10 || a>99)||(b<10 || b>99)){
            return false;
        }
        while(a>0){
            x1=a%10;
            a/=10;
            x2=a%10;
            a/=10;
        }
        while(b>0){
            x3=b%10;
            b/=10;
            x4=b%10;
            b/=10;
        }
        if((x1==x3) ||(x1==x4) ||(x2==x3)||(x2==x4))
        return true;
        else return false;
    }
}
