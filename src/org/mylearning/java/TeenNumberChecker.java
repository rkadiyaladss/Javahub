package org.mylearning.java;
public class TeenNumberChecker {

    public static boolean hasTeen(int a,int b,int c){
        boolean b1 = true;
        if ((a>=13&&a<=19) || (b>=13&&b<=19) || (c>=13&&c<=19)){
            return b1;
        }else return false;
    }
    public static boolean isTeen(int a){
        boolean b1 = true;
        if (a>=13&&a<=19){
            return b1;
        } return false;
    }
}
