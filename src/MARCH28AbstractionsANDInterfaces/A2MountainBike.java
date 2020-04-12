package MARCH28AbstractionsANDInterfaces;

public class A2MountainBike extends A2Bicycle {
    private String tireType;
    private int seatHeight;
    public A2MountainBike(String tireType,int seatHeight){
        this.tireType=tireType;
        this.seatHeight=seatHeight;
    }
    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    void speedUp() {
        System.out.println("Speed increased");
    }
    void slowDown() {
        System.out.println("Speed decreased");

    }
    void stop() {
        System.out.println("Mountain Bike stopped");

    }
    void start() {
        System.out.println("Mountain Bike started");

    }
    void switchToSteepMode(){
        System.out.println("Steep Mode activated");
    }
    public String toString() {
        return "A2MountainBike{" +
                "tireType='" + tireType + '\'' +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
