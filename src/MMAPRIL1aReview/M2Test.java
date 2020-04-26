package MMAPRIL1aReview;

public class M2Test {
    public static void main(String[] args) {
        M2A ob1 = new M2A();
        System.out.println("ob1 = "+ob1.getA());

        M2B ob2 = new M2B();
        System.out.println("ob2 = "+ob2.getA());

        M2C ob3  = new M2C();
        System.out.println("ob3 = "+ob3.getA());

        ob3.setA(40);
        ob2.setA(60);
        System.out.println();
        System.out.println("ob1 = "+ob1.getA());
        System.out.println("ob2 = "+ob2.getA());
        System.out.println("ob3 = "+ob3.getA());

    }
}
