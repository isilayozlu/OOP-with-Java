package AbstractClass.Q2;

public class Fish extends Animal implements Swimmable {
    @Override
    public void swim(){
        System.out.println("fish swim");

    }

    public void move(){
        System.out.println("fish move");

    }
}
