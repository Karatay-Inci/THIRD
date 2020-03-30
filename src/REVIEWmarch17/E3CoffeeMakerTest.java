package REVIEWmarch17;

public class E3CoffeeMakerTest {
    public static void main(String[] args) {
        E3CoffeeMaker myMaker = new E3CoffeeMaker(6);
        System.out.println(myMaker.toString());
        myMaker.setTimer(20);
        System.out.println(myMaker.getTimer());
        myMaker.brewCoffee();
        myMaker.resetTimer();
        myMaker.brewCoffee();
    }
}
