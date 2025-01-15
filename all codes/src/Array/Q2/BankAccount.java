package Array.Q2;

public class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount(int accountNo,String holderName,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
        this.holderName=holderName;
    }

    void balanceChange(double amount){
        this.balance-=amount;
    }

    @Override
    public int compareTo(BankAccount t){
        return this.holderName.compareTo(t.holderName);
    }

    @Override
    public String toString(){
        return "Account:" +accountNo + ","+holderName +"," + balance;
    }

}
