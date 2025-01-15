package week3;
import java.util.Scanner;
public class Account {
    private String password="1234";

    public String getPassword() {
        return password;
    }

    public int getBakiye() {
        int bakiye = 1000;
        return bakiye;
    }

    public void withdraw(){
        int deneme=0;

        Scanner scanner= new Scanner(System.in);

        while(deneme != 4){
            System.out.println("şifrenizi giriniz:");
            String sifre = scanner.nextLine();

            if(sifre.equals(getPassword())){
                System.out.println("sifre doğru");
                System.out.println("çekmek istediğiniz miktarı giriniz");
                int miktar = scanner.nextInt();

                if (miktar > getBakiye()) {
                    System.out.println("yetersiz bakiye");
                    System.out.println("işlem başarısız");
                    deneme++;
                }
                else {
                    System.out.println("para çekme işlemi başarıyla gerçekleştirildi");
                    System.out.println("kalan bakiye" + (getBakiye() - miktar));
                    deneme++;
                }
                break;
            }
            else{
                System.out.println("yanlis sifre,tekrar deneyiniz");
                deneme++;
            }
        }
        if(deneme==4){
            System.out.println("hesabınız blok edildi");
        }
    }

}
