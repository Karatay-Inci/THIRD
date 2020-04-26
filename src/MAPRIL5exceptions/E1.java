package MAPRIL5exceptions;

import Creating_Classes.E;

public class E1 {
    public static void main(String[] args) {
        int x=10;
        int y=1;        //int y=0 --> if write this ---> output = oops division by zero exception
        try {
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
            System.out.println("oops division by zero exception");
        }
System.out.println();
        String s=null;      //String s="abc"--> if write this ---> output =3
        try {
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println("oops");
        }
System.out.println();
        String a="a";
        try {
            int number = Integer.parseInt(a);
        }
        catch (Exception e){
            System.out.println("Sorry I could not convert");
        }
System.out.println();
        int numbers[]={1,2,3,4,5};
        try {
            System.out.println(numbers[9]);     //numbers[4]--> if write this ---> output =5
        }
        catch (Exception e){
            System.out.println("We do not have that index");
        }
System.out.println();
        System.out.println("can you see me?");
    }
}
