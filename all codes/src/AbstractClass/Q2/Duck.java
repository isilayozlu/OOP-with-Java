package AbstractClass.Q2;

public class Duck extends Animal implements Swimmable, Flyable{

    @Override
    public void move(){
        System.out.println("duck move");
    }

    @Override
    public void swim(){
        System.out.println("duck swim");

    }
    @Override
    public void fly(){
        System.out.println("duck fly");
    }

}
