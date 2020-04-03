package RMARCH21Inheritance;

public class I6ChildTest {
    public static void main(String[] args) {
        I6Child myChild = new I6Child(10,40);
        System.out.println(myChild.getX());
        System.out.println();

        myChild.setX(30);
        System.out.println(myChild.getX());
        System.out.println();

        I6ParentQ myParent = new I6ParentQ(15);
        System.out.println(myParent.getX());
        System.out.println();
    }
}
