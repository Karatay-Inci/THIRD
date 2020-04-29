package MMAPRIL5exceptions;

public class E2 {
    public static void main(String[] args) {
        try {
            System.out.println(4/0);
            System.out.println("code");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        int i=50;
        int j=1;
        int data;
        try {
            data=i/j;
            System.out.println(data);
        }
        catch (Exception e){
            System.out.println(i/(j+2));
        }

        try {
            int c=4/0;
        }
        catch (RuntimeException e){
            System.out.println(e);
        }

        try {
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[10]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("code");
    }
}
