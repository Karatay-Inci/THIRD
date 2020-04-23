package MMAPRIL1Review;

public class M8ShapeCalculateTest {
    public static void main(String[] args) {
        M8ShapeCalculate.calculatePerimeter(10);
        M8ShapeCalculate.calculatePerimeter(10.0);
        M8ShapeCalculate.calculatePerimeter(10,10,10);

        System.out.println();

        M8ShapeCalculate myShp = new M8ShapeCalculate();
        myShp.calculateArea(10);
        myShp.calculateArea(10.0);
        myShp.calculateArea(10,20);

    }
}
