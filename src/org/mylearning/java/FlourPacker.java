package org.mylearning.java;
public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
        System.out.println("bigCount "+bigCount+"  smallCount  "+smallCount+"  goal  "+goal);
        int sum = bigCount * 5 + smallCount * 1;
        if(sum < goal){
            return false;
        }
        if(sum == goal){
            return true;
        }
        while(sum > goal && bigCount>0 ){
            if((sum - 5) < goal) {
                break;
            }
            sum -= 5;
            bigCount--;
        }
        return sum - smallCount <= goal;
    }
}
