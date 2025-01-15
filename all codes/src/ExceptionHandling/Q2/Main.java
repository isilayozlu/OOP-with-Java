package ExceptionHandling.Q2;

public class Main {
    public static void main(String[] args) {
        try {
            NFT nft = new NFT(123, "isilay");
            System.out.printf("balance: %f Owner:%s"  , nft.getBalance() ,nft.getOwner());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
