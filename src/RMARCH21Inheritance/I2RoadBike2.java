package RMARCH21Inheritance;

public class I2RoadBike2 extends I2Bicycle1{
    private int tireSize;
    private int handleBarSiz;

    public I2RoadBike2(int tireSize,int handleBarSiz,int gear,int speed){
        super(gear,speed);
        this.tireSize=tireSize;
        this.handleBarSiz=handleBarSiz;

    }
}
