package MARCH28Interfaces;

public class A2WorkStationTest {
    public static void main(String[] args) {
        String mainboard[]={"intel","3000","128"};
        A2WorkStation myWorks = new A2WorkStation(mainboard,64,8900,"amd","maxi",42);
        myWorks.setMainBoard();
        myWorks.installMemory(64);
        myWorks.installCPU();
        A2DellWorkStation myDell = new A2DellWorkStation(mainboard,128,2500,"intel","tower",29);
    }
}
