package MMAPRIL5exceptions;

import java.util.Scanner;

public class E7DivideZero {
    public static void main(String[] args) {
        divide();
    }
    public static void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number :");
        int first=scan.nextInt();
        System.out.print("Enter second number :");
        int second = scan.nextInt();
        try {
            System.out.println(first/second);
        }
        catch (ArithmeticException e){
            System.out.println("Sorry I can not divide to zero\n Please try again ");
        }
    }
}
