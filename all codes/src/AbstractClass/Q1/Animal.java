package AbstractClass.Q1;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    abstract void sescikar();

    void bilgiGoster(){
        System.out.println("Name:" + this.name);
        System.out.println("Age :" + this.age);
    }
}
