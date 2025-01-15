package Inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void eat(){
        System.out.println("hayvan yemek yiyor");
    }

    public void sleep() {
        System.out.println("hayvan uyuyor");
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

}
