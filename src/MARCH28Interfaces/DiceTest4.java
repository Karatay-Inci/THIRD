package MARCH28Interfaces;

public class DiceTest4 {
    public static void main(String[] args) {
        DiceCasino2 myCasino = new DiceCasino2();
        System.out.println(myCasino.rollDice());

        DiceDarkCasino3 myDark = new DiceDarkCasino3();
        System.out.println(myDark.rollDice());
    }
}
