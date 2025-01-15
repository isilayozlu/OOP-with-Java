package AbstractClass.Q4;

public abstract class Developer {
    public String fullName;
    public int id;

    abstract double income();

    public Developer (String fullName, int id){
        this.fullName=fullName;
        this.id=id;
    }
}
