package GuessingGame;

public class Player {
    private String name;
    private int OynananOyunSayisi;
    private int kazanmaSayisi;

    public Player(String name){
        this.name=name;
        this.OynananOyunSayisi=0;
        this.kazanmaSayisi=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOynananOyunSayisi() {
        return OynananOyunSayisi;
    }

    public int getKazanmaSayisi() {
        return kazanmaSayisi;
    }

    public void increasekazanmasayisi(){
        kazanmaSayisi++;
    }
    public void incereaseOynananOyunSayisi(){
        OynananOyunSayisi++;
    }

}
