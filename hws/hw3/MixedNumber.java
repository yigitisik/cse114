//Mustafa Yigit Isik 113080465
package com.company;
import java.math.BigInteger; import java.util.Scanner;

public class MixedNumber {
    private int x; private int y; private int z;
    public MixedNumber(int x, int y, int z){
        this.x = x; this.y = y; this.z = z;

    }
    ///// GETTER AND SETTERS
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public void Add(MixedNumber other){
        int x = (this.x * this.z)+this.y; int y=(this.z); int z=(other.x *other.z)+other.y; int w=(other.z);

        int finx = (x*w)+ y*z; int finy = (y*w);
        this.x = finx/finy; this.y = finx%finy; this.z = z;
        if(this.y == 0) this.z =0;

        BigInteger bigy = new BigInteger(""+this.y+"");
        BigInteger bigz=new BigInteger(""+this.z +"");
        BigInteger denominator=bigy.gcd(bigz);
        if(denominator.longValue()!=0){
            this.y = (int) (this.y/denominator.longValue());
            this.z =(int) (this.z /denominator.longValue());
        }
    }
    public void Subtract(MixedNumber other){
        int x = (this.x*this.z)+this.y;
        int y = this.z;
        int z = (other.x * other.z) + other.y;
        int w = other.z;
        int finx=(x*w)-(y*z);
        int finy=(y*w);
        this.x =finx/finy;
        this.y =Math.abs(finx)%finy;
        this.z =finy;
        if(this.y ==0){
            this.z =0;
        }
        BigInteger bigy=new BigInteger(""+this.y +"");
        BigInteger bigz=new BigInteger(""+this.z +"");
        BigInteger denominator=bigy.gcd(bigz);
        if(denominator.longValue()!=0){
            this.y =(int) (this.y /denominator.longValue());
            this.z =(int) (this.z /denominator.longValue());
        }
    }
    public void Multiply(MixedNumber other){
        int x=(this.x *this.z)+this.y;
        int y=(this.z);
        int z=(other.x *other.z)+other.y;
        int w=(other.z);
        int finx = x*z;
        int finy = y*w;
        this.x = finx/finy; this.y = finx%finy; this.z = finy;
        if(this.y == 0) this.z = 0;

        BigInteger bigy = new BigInteger(""+this.y +"");
        BigInteger bigz=new BigInteger(""+this.z +"");
        BigInteger denominator = bigy.gcd(bigz);
        if(denominator.longValue() != 0){
            this.y =(int) (this.y /denominator.longValue());
            this.z =(int) (this.z /denominator.longValue());
        }
    }
    public void Divide(MixedNumber other){
        int x=(this.x *this.z)+this.y;
        int y=(this.z);
        int z=(other.x *other.z)+other.y;
        int w=(other.z);
        int finx = x*w;
        int finy = y*z;
        this.x =finx/finy;
        this.y =finx%finy;
        this.z =finy;
        if(this.y ==0){
            this.z =0;
        }
        BigInteger bigy=new BigInteger(""+this.y +"");
        BigInteger bigz=new BigInteger(""+this.z +"");
        BigInteger denominator=bigy.gcd(bigz);
        if(denominator.longValue()!=0){
            this.y =(int) (this.y /denominator.longValue());
            this.z =(int) (this.z /denominator.longValue());
        }
    }
    public String toString(){
        return "("+this.x +" + "+this.y +"/"+this.z +")";
    }
}
class TestingMixedNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MixedNumber firstNumber;
        MixedNumber secondNumber;
        MixedNumber firstOriginal;
        MixedNumber secondOriginal;
        while (true) {
            System.out.print("Enter the whole number for the first mixed number:");
            int x = keyboard.nextInt();
            System.out.print("Enter the numerator for the first mixed number:");
            int y = keyboard.nextInt();
            System.out.print("Enter the denominator for the first mixed number:");
            int z = keyboard.nextInt();
            if (y % z != 0) {
                firstNumber = new MixedNumber(x, y, z);
                break;
            }
            System.out.println("Invalid entry, please try again!");
        }
        while (true) {
            System.out.print("Enter the whole number for the second mixed number:");
            int x = keyboard.nextInt();
            System.out.print("Enter the numerator for the second mixed number:");
            int y = keyboard.nextInt();
            System.out.print("Enter the denominator for the second mixed number:");
            int z = keyboard.nextInt();
            if (y % z != 0) {
                secondNumber = new MixedNumber(x, y, z);
                break;
            }
            System.out.println("Invalid mixed number,try again!");
        }
        System.out.println("First mixed number: " + firstNumber);
        System.out.println("Second mixed number: " + secondNumber);
        firstOriginal = new MixedNumber(firstNumber.getX(), firstNumber.getY(), firstNumber.getZ());
        secondOriginal = new MixedNumber(secondNumber.getX(), secondNumber.getY(), secondNumber.getZ());
        //ADD
        firstNumber.Add(secondNumber);
        System.out.println("The result of the addition of the mixed numbers is: "+firstNumber);
        //SUBTRACT
        firstNumber.setX(firstOriginal.getX());
        firstNumber.setY(firstOriginal.getY());
        firstNumber.setZ(firstOriginal.getZ());
        firstNumber.Subtract(secondNumber);
        System.out.println("The result of the subtraction of the mixed numbers is: "+firstNumber);
        //MULTIPLY
        firstNumber.setX(firstOriginal.getX());
        firstNumber.setY(firstOriginal.getY());
        firstNumber.setZ(firstOriginal.getZ());
        firstNumber.Multiply(secondNumber);
        System.out.println("The result of the multiplication of the mixed numbers is: "+firstNumber);
        //DIVIDE
        firstNumber.setX(firstOriginal.getX());
        firstNumber.setY(firstOriginal.getY());
        firstNumber.setZ(firstOriginal.getZ());
        firstNumber.Divide(secondNumber);
        System.out.println("The result of the division of the mixed numbers is: "+firstNumber);
    }
}