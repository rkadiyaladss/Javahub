package org.mylearning.java;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kilobytes = kiloBytes / 1024;
            int megabytes = kiloBytes % 1024;
            System.out.println(kiloBytes +" KB = " +kilobytes + " MB and "+megabytes +" KB");
        }
    }
}
