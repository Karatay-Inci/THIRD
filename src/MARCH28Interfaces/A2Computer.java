package MARCH28Interfaces;

import java.util.Arrays;

public class A2Computer {
    private String mainBoardSpecs[];
    private int memorySize;
    private int cpuSpeed;
    private String cpuType;

    public A2Computer(String[] mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType) {
        this.mainBoardSpecs = mainBoardSpecs;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
    }

    public String[] getMainBoardSpecs() {
        return mainBoardSpecs;
    }

    public void setMainBoardSpecs(String[] mainBoardSpecs) {
        this.mainBoardSpecs = mainBoardSpecs;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }
    public void turnOn(){
        System.out.println("Computer turned on");
    }
    public void turnOff(){
        System.out.println("Computer turned off");
    }
    public void boot(){
        System.out.println("Computer Booted");
    }

    @Override
    public String toString() {
        return "A2Computer{" +
                "mainBoardSpecs=" + Arrays.toString(mainBoardSpecs) +
                ", memorySize=" + memorySize +
                ", cpuSpeed=" + cpuSpeed +
                ", cpuType='" + cpuType + '\'' +
                '}';
    }
}
