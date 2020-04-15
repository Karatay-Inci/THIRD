package MARCH28Interfaces;

public class DiceHonest7 implements Dices5{
    public int[] rollArray(){
        int result[]={0,0};
        result[0]=(int)(Math.random()*faces+1);
        result [1]=(int)(Math.random()*faces+1);
        return result;
    }
    public void roll(){
        System.out.println((int)(Math.random()*faces+1));
    }
    public void rollTwice(){
        System.out.println((int)(Math.random()*faces+1));
        System.out.println((int)(Math.random()*faces+1));
    }
    public void rollTriple(){
        System.out.println((int)(Math.random()*faces+1));
        System.out.println((int)(Math.random()*faces+1));
        System.out.println((int)(Math.random()*faces+1));
    }
    public void rollEmpty(){
        System.out.println("There is no number");
    }
}
