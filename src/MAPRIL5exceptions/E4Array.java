package MAPRIL5exceptions;

public class E4Array {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("Code...");
    }
}
