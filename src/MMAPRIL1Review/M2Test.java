package MMAPRIL1Review;

public class M2Test {
    public static void main(String[] args) {
        M2A ob1 = new M2A(10);
        System.out.println(ob1.getA());
        M2B ob2 = new M2B(2);
        System.out.println(ob2.getA());
        M2C ob3  = new M2C(5);
        System.out.println(ob3.getA());
        ob3.setA(40);
        System.out.println(ob1.getA());
        System.out.println(ob2.getA());
        System.out.println(ob3.getA());

    }
}
