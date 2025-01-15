package AbstractClass.Q1;

public class Main {
    public static void main(String[] args) {
        Animal animal;

        Dog dog= new Dog("köpek", 5);
        Cat cat= new Cat("kedi", 2);

        dog.sescikar();
        dog.bilgiGoster();
        System.out.println("\n--------------\n");
        cat.sescikar();
        cat.bilgiGoster();
    }
}
