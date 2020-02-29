package org.mylearning.java;

public class SecondsAndMinutesChanllenge {
    public static String getDurationString(int minutes,int seconds){

        if((minutes>=0) && (seconds>=0 && seconds<=59)){

            int ohours=minutes/60;
            int omins=minutes%60;

            return ohours+"h "+omins+"m "+seconds+"s";
        }
        return "Invalid Value";
    }
    public static String getDurationString(int seconds){

        if(seconds>=0){

            int omins=seconds/60;
            int oseconds=seconds%60;

            return getDurationString(omins,oseconds);
        }
        return "Invalid Value";
    }

}

