package MARCH28AbstractionsANDInterfaces;

public class A3TilingTest {
    public static void main(String[] args) {
        A3Tiling myTiles = new A3Tiling("Alma",5000,0,"wood");
        System.out.println(myTiles.calculateTotalmaterialPrice());
        myTiles.printQuete();
    }
}
