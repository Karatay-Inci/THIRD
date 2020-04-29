package MAPRIL5exceptions;

import javax.print.attribute.standard.NumberUp;

public class E10 {
    public static void main(String[] args) {
        String arr[] = {"al","b123",null,"c","fghi",null,"jklmn"};
        try {
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i].length());
            }
        }
        catch (NullPointerException e){
            System.out.println("oops");
        }
        finally {
            System.out.println(arr[6].length());
        }
        System.out.println("-----------------");
        for (int i = 0; i <arr.length ; i++) {
            try {
                System.out.println(arr[i].length());
            }
            catch (NullPointerException e){
                System.out.println("oops");
            }
            finally {
                System.out.println("I will runnn");
            }
        }
    }
}
