package MARCH21Inheritance;

public class I2Bicycle1 {
    protected int gear;
    protected int speed;

    public I2Bicycle1 (int gear,int speed ){
        this.gear=gear;
        this.speed=speed;
    }
    public void speedUp(){
        this.speed++;
    }
    public void slowDown(){
        this.speed--;
    }
}
