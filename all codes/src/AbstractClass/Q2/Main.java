package AbstractClass.Q2;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();

        ((Swimmable) fish).swim();
        fish.move();

        ((Flyable) fish).fly(); // fish cannot fly so does not work
    }
}