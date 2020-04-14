package MARCH28Interfaces;

public class DiceCasino2 extends  Dice1{
    public int rollDice(){
        int result = (int)(Math.random()*super.faces)+1;
        return result;
    }
}
