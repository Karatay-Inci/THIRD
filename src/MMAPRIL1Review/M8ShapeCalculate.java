package MMAPRIL1Review;

public class M8ShapeCalculate {
    public static void calculatePerimeter(int edge1, int edge2, int edge3) {
        System.out.println("Perimeter of triangle :" + (edge1 + edge2 + edge3));
    }

    public static void calculatePerimeter(int edge) {
        System.out.println("Perimeter of square   :"+(4*edge));
    }
    public static void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle   :"+(2*22/7*radius));
    }
    public static void calculateArea(int a,int b) {
        System.out.println("Area of rectangle     :"+(a*b));
    }
    public static void calculateArea(int edge) {
        System.out.println("Area of square        :" + (edge * edge));
    }
    public static void calculateArea(double radius) {
        System.out.println("Area of circle        :"+(2*22/7*radius*radius));
    }
}