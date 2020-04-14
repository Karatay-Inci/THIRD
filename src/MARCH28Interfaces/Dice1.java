package MARCH28Interfaces;

abstract class Dice1 {
    final int faces = 6;

    abstract int rollDice();
    public void rollTwice(){
        int result =(int)(Math.random()*faces)+1;
        System.out.println(result);
    }
}
