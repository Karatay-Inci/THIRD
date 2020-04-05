package MARCH21Inheritance;

public class I3CalculatorTest {
    public static void main(String[] args) {
        I3Calculator myCalc= new I3Calculator();
        System.out.println(myCalc.add(1,1));
        I3AdvancedCalculator myAdv = new I3AdvancedCalculator();
        System.out.println(myAdv.calcFactorial(4));
    }
}
