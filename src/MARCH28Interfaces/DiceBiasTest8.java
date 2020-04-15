package MARCH28Interfaces;

public class DiceBiasTest8 {
    public static void main(String[] args) {
        DiceBias6 myBias = new DiceBias6(8);
        myBias.roll();
        myBias.rollTwice();
        myBias.rollTriple();
        //myBias.biasedRoll();
        myBias.setBiasFactor(3);
        for (int i = 0; i <10 ; i++) {
            myBias.biasedRoll();
        }
    }
}
