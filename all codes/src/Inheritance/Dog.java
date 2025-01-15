package Inheritance;

public class Dog extends Animal{
    private String furColor;

    public Dog(String name, int age, String furColor){
        super(name,age); // consturctor çağırdığın için onun içindeki parametre kadar değer girmelisin
        this.furColor=furColor;

    }

    @Override
    public void eat(){
        System.out.println("köpek yemek yiyor");
    }

    @Override
    public void sleep() {
        System.out.println("köpek uyuyor");
    }

    public void bark(){
        System.out.println("köpek havlıyor");
    }

    public String getFurColor() {
        return furColor;
    }

}
