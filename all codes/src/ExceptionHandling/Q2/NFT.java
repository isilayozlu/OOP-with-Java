package ExceptionHandling.Q2;

public class NFT {
    private double balance;
    private String owner;

    public NFT(double balance, String owner){
        this.owner=owner;
        SetBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void SetBalance(double balance){
        if(balance < 0 || balance > 10000)
            throw new IllegalArgumentException("look at the balance");
        this.balance=balance;
    }

}
