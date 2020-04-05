package MARCH22POLYMORPHISM;

public class P2BankTest {
    public static void main(String[] args) {
        P2Bank myBank = new P2Bank(112312,"saving",350);
        System.out.println();
        P2Loan myLoan = new P2Loan(213213,"new loan",4000,1.05,60,30000);
        System.out.println();
        P2Loan myCarLoan = new P2CarLoan(111,"car",3000,1.04,72,40000,1.08,850);
        System.out.println(myCarLoan.calculateMonthlyPayment());
        System.out.println();
        P2Loan myHomeLoan =new P2HomeLoan(123,"home",1.9,300,60000,12000,1.08);
    }
}
