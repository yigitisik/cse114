// Mustafa Yigit Isik
// 113080465
package com.company;
import java.util.Scanner;
public class isDivisibleByFourOrSeven {
    public static boolean isDivisibleByFourOrSeven(int number) {
        if (number % 4 == 0 || number % 7 == 0) {
            return true;
        } else
            return false;
    }
}