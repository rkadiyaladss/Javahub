package org.mylearning.java;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        int oneyear=365*24*60;
        int oneday=24*60;
        if(minutes>=0){
            if (minutes>=oneyear){
                int years= (int)minutes/oneyear;
                int rminutes= (int)minutes%oneyear;
                int rdays=rminutes/oneday;
                System.out.println(minutes+" min = "+years+" y and "+rdays+" d");
            }else {
                int rdays=(int)minutes/oneday;
                System.out.println(minutes+" min = "+0+" y and "+rdays+" d");
            }
        }else System.out.println("Invalid Value");

    }
}
