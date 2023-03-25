//Mustafa Yigit Isik 113080465
package com.company;
import java.util.*;
public class QuestionTwo {
    public static void main(String[] args) {
        char c;String first;String second;
        int count = 0;int i = 0;int last = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first string: ");first = keyboard.nextLine();
        System.out.print("Enter second string: ");second = keyboard.nextLine();
        while (i <= first.length() - second.length()) {
            int flagging = 0;
            if (first.charAt(i) == second.charAt(0)) {
                int k = 0;
                int temporary = i;
                while (k < second.length()) {
                    if (first.charAt(i) != second.charAt(k)) {
                        flagging = 0;
                        break;
                    } else {
                        flagging = 1;
                    }
                    k++;i++;
                }
                if (flagging == 1) {
                    count++; last = temporary;
                }
            } else i++;
        }
        if (count == 0) {
        System.out.printf("%s isn't found in %s\n", second, first);
        } else
        System.out.printf("%s occurs %d times in %s."+
                " Its last local is %d\n", second, count, first, last);
    }
}