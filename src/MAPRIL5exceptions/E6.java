package MAPRIL5exceptions;

public class E6 {
    public static void main(String[] args) {
        int arr[] = new int [5];
        try {
            arr[5]=40/10;
        }
        catch (Exception e){
            System.out.println("Exception handled");
        }
        System.out.println("Code..");
    }
}
