package Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog1= new Dog("köpek" , 17, "furColor");
        Bird bird1= new Bird("kuş", 2,"wingSpan" );

        dog1.eat();
        dog1.bark();
        dog1.sleep();

        System.out.println("Name:" + dog1.getName());


        System.out.println("\n--------------------\n");

        bird1.eat();
        bird1.fly();
        bird1.sleep();
    }
}
