package MMAPRIL5exceptions;

import java.util.Scanner;

public class E8ArrayValue {
    public static void main(String[] args) {
        giveValue();
    }
    public static void giveValue(){
        String arr[][] = {{"Java","OOP","Abstraction"},{"Encapsulation","Inheritance"},{"Interface"}};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter index 1 :");
        int index1 = scan.nextInt();
        System.out.print("Enter index 2 :");
        int index2 = scan.nextInt();
        try {
            System.out.println(arr[index1][index2]);
            System.out.println("Item retrieved successfully");
        }
        catch (Exception e){
            System.out.println("Invalid index");
        }
    }
}
