// Mustafa Yigit Isik
// 113080465
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);

        /// SCANNER FOR THE FIRST Q
        System.out.println("Please enter the first number");
        int side1 = myKeyboard.nextInt();
        System.out.println("Please enter the second number");
        int side2 = myKeyboard.nextInt();
        System.out.println("Please enter the third number");
        int side3 = myKeyboard.nextInt();
        System.out.println(triangleDefiner(side1, side2, side3));

        ///SCANNER FOR THE SECOND Q
        System.out.println("Please enter a string");
        String str = myKeyboard.next();
        System.out.println(amountsInStringCalculator(str));

        /// SCANNER FOR THE THIRD Q
        System.out.println("Please enter the distance");
        int distance = myKeyboard.nextInt();
        System.out.println(trainFareCalculator(distance));

        /// SCANNER FOR THE FOURTH Q
        System.out.println("Please enter the number");
        int number = myKeyboard.nextInt();
        System.out.println(isDivisibleByFourOrSeven(number));
    }

    /// QUESTION 1
    public static String triangleDefiner(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "Invalid input";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if ((side1 == side2 && side2 != side3) || (side2 == side3 && side2 != side1) || (side1 == side3 && side1 != side2)) {
            return "Isosceles";
        } else
            return "Scalene";
    }
    /// QUESTION 2
    public static String amountsInStringCalculator(String str) {
        int alpCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                alpCounter++;
            }
        }
        int nonAlp=str.length() - alpCounter;
        return "Length of the string is "+str.length()+ ". Number of non-alphabets is "+nonAlp;
    }
    /// QUESTION 3
    public static int trainFareCalculator(int distance) {
        int sum = 0;
        int sum2 = 50;
        int sum3 = 150;
        if (distance <= 50) {
            return sum = distance;
        } else if (distance > 50 && distance <= 100) {
            return sum2 += (2 * (distance - 50));
        } else if (distance > 100) {
            return sum3 += (3 * (distance - 100));
        }
        return -1;
    }
    /// QUESTION 4
    public static boolean isDivisibleByFourOrSeven(int number) {
        if (number % 4 == 0 || number % 7 == 0) {
            return true;
        } else
            return false;
    }
}