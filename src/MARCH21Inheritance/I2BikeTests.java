package MARCH21Inheritance;

public class I2BikeTests {
    public static void main(String[] args) {
        I2Bicycle1 myBike = new I2Bicycle1(30,10);
        myBike.slowDown();
        I2RoadBike2 myRoadBike = new I2RoadBike2(29,16,40,20);
        myRoadBike.speedUp();
    }
}
