package MARCH28Interfaces;

public class DiceDarkCasino3 extends DiceCasino2 {
    public int rollDice(){
        return (int)(Math.random()*10)+1;
    }
}
