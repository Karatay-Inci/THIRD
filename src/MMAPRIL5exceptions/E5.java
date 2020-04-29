package MMAPRIL5exceptions;

public class E5 {
    public static void main(String[] args) {
        String str = null;          // String str2="abc";----> if write this --> output = 4

        try {
            System.out.println(str.length());
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
