package org.mylearning.java;

public class NumberToWords {
    public static void numberToWords(int number) {
        int lastDigit=0;
        int reverse=0;
        int reverseNumber=0;
        if(number<0) System.out.println("Invalid Value");
        else if(number==0) System.out.println("Zero");
        else {
            reverseNumber = reverse(number);
            int oDigitCount = getDigitCount(number);
            int rDigitCount = getDigitCount(reverseNumber);
            int dDigitCount = oDigitCount - rDigitCount;
            while (reverseNumber != 0) {
                reverse = reverse * 10;
                lastDigit = reverseNumber % 10;
                reverse = reverse + reverseNumber % 10;
                reverseNumber = reverseNumber / 10;
                switch (lastDigit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                }
            }
            for (int i = 1; i <= dDigitCount; i++) {
                System.out.println("Zero");
            }
        }
    }
    public static int reverse(int number){
        int reverse=0;
        int lastDigit=0;
        while (number !=0) {
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        } return reverse;
    }
    public static int getDigitCount(int number){
        int digitCount=0;
        int digitReverse=0;
        if (number<0) return -1;
        if (number==0) return 1;
        while (number !=0) {
            digitReverse = digitReverse + number%10;
            number = number/10;
            digitCount++;
        } return digitCount;
    }
}
