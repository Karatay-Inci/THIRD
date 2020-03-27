package Creating_Classes;

public class ElectricBill1Test {
    public static void main(String[] args) {
        ElectricBill1 myBill = new ElectricBill1(9876999,0,"veteran",0);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
        myBill.addConsumption(33);
        myBill.readCounter();
    }
}
