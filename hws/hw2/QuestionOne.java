//Mustafa Yigit Isik 113080465
package com.company;
import java.util.Scanner;
public class QuestionOne {
    public static void main(String[] args){
        String str = ""; char c;
        while(true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please, enter an input string: ");
            str = keyboard.nextLine();
            if (str.length() < 13) {
                String endResult = ""; int i;
                // to distinct the parts between the loop and the body//
                for (i = 0; i < str.length(); i++) {
                    c = str.charAt(i);
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    } else {
                        c = Character.toUpperCase(c);
                    }
                    endResult += c;
                    System.out.println(endResult);
                }
                // to distinct the parts between the loop and the body//
            } else {
                System.out.println("The input string has a length larger than 12, please enter again.");
            }
        }
    }
}