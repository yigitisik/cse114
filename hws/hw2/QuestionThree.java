// Mustafa Yigit Isik 113080465
package com.company;
import java.util.Scanner;
public class QuestionThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a string: ");
        String str = input.nextLine();
        boolean x = hasTwoConsecutiveLetters(str);
        if(x){
            System.out.println("The input string has two same letters back-to-back.");
        }else
            System.out.println("The input string doesn't have two same letters back-to-back.");
    }
    public static boolean hasTwoConsecutiveLetters(String str){
        str = str.toLowerCase();
        int f = 1;
        for(int i = 0; i<str.length()-1 ;i++){
            if(str.charAt(i)==str.charAt(f)){
                return true;
            }
            f++;
        }
        return false;
    }
}