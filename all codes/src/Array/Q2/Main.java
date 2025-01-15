package Array.Q2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts= new ArrayList<>();
        accounts.add(new BankAccount(1,"abil",3000));
        accounts.add(new BankAccount(2,"ayse", 309842));
        accounts.add(new BankAccount(3, "nazli", 5344));
        accounts.add(new BankAccount(4,"zeyn", 653));

        Collections.sort(accounts);
        for(BankAccount a: accounts){
            a.balanceChange(100);
            System.out.println(a);
        }
    }

}
