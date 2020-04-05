package MARCH22POLYMORPHISM;

public class P2HomeLoan extends P2Loan{
    double PMI;

    public P2HomeLoan(int accNumber, String accName, double bal, double intRate,int numPayment, double amount, double PMI){
        super(accNumber,accName,bal,intRate, numPayment,amount);
        this.PMI = PMI;
    }
    public double calculateMonthlyPayment(){
        return super.loanAmount*super.interestRate/super.numberOfPayment+this.PMI;
    }
    public double calculateTotalPayment(){
        return super.loanAmount*super.interestRate+this.PMI*super.numberOfPayment;
    }

}
