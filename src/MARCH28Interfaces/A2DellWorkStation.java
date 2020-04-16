package MARCH28Interfaces;

public class A2DellWorkStation extends A2WorkStation {
    public A2DellWorkStation(String[] mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(mainBoardSpecs, memorySize, cpuSpeed, cpuType, housingType, screenSize);
    }
    public void installDellSoftware(){
        System.out.println("Dell Sofware installed");
    }
}
