package GuessingGame;

public class Main {
    public static void main(String[] args) {
        Player player1= new Player("player1");
        GuessingGame game= new GuessingGame(player1);

        game.start();
    }

}
