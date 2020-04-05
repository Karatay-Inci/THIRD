package MARCH17REVIEW;

public class E5CarMaintainTest {
    public static void main(String[] args) {
        E5CarMaintain myCar = new E5CarMaintain("Toyota",65000,70000,"new","new","old");
        System.out.println(myCar.toString());
        myCar.displayFilterStatus();
        myCar.doOilChange();
        myCar.setAirFilterStatus("old");
        myCar.doOilChange();
        System.out.println(myCar.getOdometerNextOilChange());
        System.out.println(myCar.toString());
        myCar.doOilChange();
        myCar.doOilChange();
        System.out.println(myCar.toString());
    }

}
