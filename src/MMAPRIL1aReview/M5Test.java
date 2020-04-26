package MMAPRIL1aReview;

public class M5Test {
    public static void main(String[] args) {
        M5Operations parent = new M5Operations();
        parent.add(1,2,3);

        M5AdvancesOps child = new M5AdvancesOps();
        child.sumProduct(2,3,4);

        System.out.println();

        parent.multiply(5,6);
        child.multiply(7,8);

        System.out.println();


        System.out.println(parent.a+" "+parent.b+" "+parent.c);
        M5Operations parent2 = new M5Operations(95,3);
        System.out.println(parent2.a);
        System.out.println(parent2.b);
        System.out.println(parent2.c);

    }
}
