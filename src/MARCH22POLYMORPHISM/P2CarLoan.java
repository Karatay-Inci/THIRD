package MARCH22POLYMORPHISM;

public class P2CarLoan extends P2Loan{
    double APR;
    int creditScore;

    public P2CarLoan(int accNumber, String accName, double bal, double intRate,int numPayment, double amount, double APR,int creditScore) {
        super(accNumber,accName,bal,intRate,numPayment,amount);
        this.APR = APR;
        this.creditScore = creditScore;
    }
    public double calculateMonthlyPayment(){
        double monthly = super.loanAmount*this.APR/super.numberOfPayment-(this.creditScore/10);
        return monthly;
    }

}
