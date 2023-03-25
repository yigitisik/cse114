// Mustafa Yigit Isik
// 113080465
package com.company;
import java.util.Scanner;
public class trainFareCalculator {
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
}
