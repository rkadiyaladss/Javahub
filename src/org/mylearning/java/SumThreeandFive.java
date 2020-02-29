package org.mylearning.java;

public class SumThreeandFive {
    public static void SumThreeFiveChallenge(){
        int count=0;
        int total=0;
        for(int i=1;i<=10000;i++){
            if((i%3==0) && (i%5==0)){
                count++;
                total+=i;
                System.out.println("found number "+i);
                if(count==5) break;
            }
        }
        System.out.println("total "+total);
    }
}
