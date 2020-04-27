package MAPRIL5exceptions;

public class E3 {
    public static void main(String[] args) {
        int arr[] = new int [5];
        try {
            arr[5]=5/0;
        }
        catch (ArithmeticException e ){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("Rest of the code");
    }
}
