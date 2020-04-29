package MMAPRIL5exceptions;

public class E10A {
    public static void main(String[] args) {
        try {
            System.out.println(7/0);
        }
        catch (ArithmeticException e){
            System.out.println("ooo zeroo");
        }
        catch (Exception e){
            System.out.println("Ooops");
        }
        finally {
            System.out.println("I will run this code what ever it takes");
        }
    }
}
