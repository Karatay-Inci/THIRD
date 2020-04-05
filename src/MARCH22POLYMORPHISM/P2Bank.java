package MARCH22POLYMORPHISM;

public class P2Bank {
    int accountNumber;
    String accountName;
    double balance;
    public P2Bank(int account, String accName, double bal){
        this.accountNumber=account;
        this.accountName=accName;
        this.balance=bal;
    }

    public void addMoney(double amount){
        this.balance+=amount;
    }
    public void drawMoney(double amount){
        if (amount<this.balance){
            this.balance=amount;
        }
        else{
            System.out.println("Balance is not enough for this amount");
        }
    }
    public void changeAccountName(String newName){
        this.accountName = newName;
    }
    public String toString(){
        return "ATTRIBUTES \n"+
                "Account Number \t\t: \t"+ this.accountNumber+
                "Account name \t\t: \t"+this.accountName+
                "Account balance \t\t: \t"+this.balance;
    }

}
