package Creating_Classes;

public class ExampleEncapsulation4Test {
    public static void main(String[] args) {
        ExampleEncapsulation4 myTest = new ExampleEncapsulation4(10,59999);
        System.out.println(myTest.getId());
        myTest.setId(40);
        System.out.println(myTest.getId());
    }
}
