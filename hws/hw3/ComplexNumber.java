//Mustafa Yigit Isik 113080465
package com.company;
import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;

public class ComplexNumber {
    public static void main(String[] args) throws IOException {
        String x = ""; double first, second;
        ComplexOperations cal = new ComplexOperations();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        //FOR THE FIRST
        System.out.println("Please, enter the first number.");
        System.out.print("Real Part of The Complex: ");
        first = Integer.parseInt(b.readLine());
        System.out.print("Imaginary Part of The Complex: ");
        second = Integer.parseInt(b.readLine());
        ComplexOperations obj1 = new ComplexOperations(first, second);;
        //FOR THE SECOND
        System.out.println("Please, enter the second number.");
        System.out.print("Real Part of The Complex:");
        first = Integer.parseInt(b.readLine());
        System.out.print("Imaginary Part of The Complex: ");
        second = Integer.parseInt(b.readLine());
        ComplexOperations obj2 = new ComplexOperations(first, second) ;
        while(x != "3"){
            System.out.println("1)Multiply");
            System.out.println("2)Divide");
            System.out.println("3)Quit");
            System.out.println("Please, choose one:");
            x = b.readLine();
            switch(x) {
                case "1":
                    cal.Multiply(obj1, obj2);
                    break;
                case "2":
                    cal.Divide(obj1, obj2);
                    break;
                default:
                    break;
            }

        }
    }
}
class ComplexOperations {
    private double real, img;

    ComplexOperations() {
        real = 0;
        img = 0;
    }
    ComplexOperations(double complex1, double complex2) {
        real = complex1;
        img = complex2;
    }
    void Multiply(ComplexOperations a, ComplexOperations b) {
        this.real = (a.real * b.real) - (a.img * b.img);
        this.img = (a.real * b.img + b.real * a.img);
        System.out.println("Product of the complex numbers is: (" + this.real + ") + (" + this.img + ") i");
    }
    void Divide(ComplexOperations a, ComplexOperations b) {
        double div = (b.real * b.real + b.img * b.img);
        this.real = (a.real * b.real + a.img * b.img) / div;
        this.img = (b.real * a.img - a.real * b.img) / div;
        System.out.println("Division of the complex numbers is: (" + this.real + ") + (" + this.img + ") i");
    }
}