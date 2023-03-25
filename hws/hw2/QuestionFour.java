//Mustafa Yigit Isik 113080465
package com.company;
import java.util.Scanner;
public class QuestionFour {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any string: ");
        String str = keyboard.nextLine();
        str = str.replaceAll(" ", "");
        String upper = ""; String lower = " ";
        for(int i = 0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                upper += str.charAt(i);
            }else
                lower += str.charAt(i);
        }
        System.out.println(lower+upper);
    }
}