package AbstractClass.Q1;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name,age);
    }
    @Override
    public void sescikar(){
        System.out.println("miyav!");
    }
}
