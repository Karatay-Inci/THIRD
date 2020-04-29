package MAPRIL5exceptions;

public class E14ThrowExample {
    public static void main(String[] args) {
        int age =30;
        if (age<21){
            throw new ArithmeticException("under 20");
        }
        else{
            System.out.println("It is OK");
        }
    }
}
