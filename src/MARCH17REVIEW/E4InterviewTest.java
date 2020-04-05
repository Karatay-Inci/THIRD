package MARCH17REVIEW;

public class E4InterviewTest {
    public static void main(String[] args) {
        E4Interview candidate1 = new E4Interview("Nihal",100,100,100);
        System.out.println(candidate1.toString());
        System.out.println(candidate1.decideResult());
        candidate1.calculateScore();
        System.out.println(candidate1.decideResult());
    }
}
