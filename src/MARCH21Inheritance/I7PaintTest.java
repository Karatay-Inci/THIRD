package MARCH21Inheritance;

public class I7PaintTest {
    public static void main(String[] args) {
        I7Paint myPaint = new I7Paint("zero gravity",2800);
        System.out.println(myPaint.toString());
        System.out.println(myPaint.calculatePrice());
        System.out.println();

       I7CustomPaint myCustomPaint = new I7CustomPaint("moon blue",3200,"durable","extra glossy");
        System.out.println(myCustomPaint.calculateCustomPrice());
    }
}
