// Mustafa Yigit Isik
// 113080465
package com.company;
import java.util.Scanner;
public class triangleDefiner {
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
}