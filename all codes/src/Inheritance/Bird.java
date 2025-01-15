package Inheritance;

public class Bird extends Animal{
    private String wingSpan;

    public Bird(String name, int age, String wingSpan){
        super(name,age);
        this.wingSpan=wingSpan;
    }

    @Override
    public void eat(){
        System.out.println("kuş yemek yiyor");
    }

    @Override
    public void sleep() {
        System.out.println("kuş uyuyor");
    }

    public void fly(){
        System.out.println("kuş uçuyor");
    }

    public String getWingSpan() {
        return wingSpan;
    }

}
