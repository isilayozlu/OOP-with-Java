package GuessingGame;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    private Player player;
    private int hedefnumara;
    private int denemehakki;


    public GuessingGame(Player player){
        this.player=player;
        this.denemehakki=10;
        Random random =new Random();
        this.hedefnumara= random.nextInt(100) + 1;

    }

    public void start(){
        System.out.println("welcome to the game");
        Scanner scanner = new Scanner(System.in);

        while(denemehakki != 0) {
            System.out.println("tahmininizi giriniz:");
            int tahmin= scanner.nextInt();
            if (tahmin == hedefnumara) {
                System.out.println("tebrikler, doğru tahmin ettiniz!");
                player.incereaseOynananOyunSayisi();
                player.increasekazanmasayisi();
                break;

            } else if (tahmin < hedefnumara) {
                System.out.println("too low, try again");
            }
            else {
                System.out.println("too high, try again");
            }
            player.incereaseOynananOyunSayisi();
            denemehakki--;
        }
        scanner.close();
        if(denemehakki==0){
            System.out.println("you lose, the correct number is:"+ hedefnumara);
            System.out.println("10 deneme hakkınızn tamamını kullandın:(");
            System.out.println("you dumb,fucking bitch im gonna fuck..");
            System.out.println("dont be sad :)");
        }

        System.out.println("wins:" + player.getKazanmaSayisi());
        System.out.println("oynama sayisi:" + player.getOynananOyunSayisi());

    }

}
