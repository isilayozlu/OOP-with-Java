package ExceptionHandling.Q3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public Person(int age){
        this("",age);
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<20 || age > 60)
            throw new IllegalArgumentException ("yaş 20 - 60 arasında olmalı");
        this.age=age;
    }

}
