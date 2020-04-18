package MMAPRIL1Review;

public class M4MoneyPrint {
    public static void main(String[] args) {
        System.out.println(M4Money.MachineSerial);
        M4Money hundred = new M4Money(100,123456);
        System.out.println(hundred.serial);

        M4Money fifty = new M4Money(50,8283728);
        System.out.println(M4Money.MachineSerial);
        System.out.println(fifty.serial);
    }
}
