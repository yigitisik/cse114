// Mustafa Yigit Isik
// 113080465
package com.company;
import java.util.Scanner;
public class amountsInStringCalculator {
    public static String amountsInStringCalculator(String str) {
        int alpCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                alpCounter++;
            }
        }
        int nonAlp=str.length() - alpCounter;
        return " Length of the string is "+str.length()+ ". Number of non-alphabets is "+nonAlp;
    }
}
