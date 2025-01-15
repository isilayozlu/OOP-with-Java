package week1;

public class Worker {
    private String name;
    private int SocialSecurityNumber;
    private float wage;
    private int WorkingHours;

    public Worker(String name, int SocialSecurityNumber, float wage, int WorkingHours){
        this.name=name;
        this.SocialSecurityNumber=SocialSecurityNumber;
        this.wage=wage;
        this.WorkingHours=WorkingHours;
    }

    public String getName() {
        return name;
    }

    public float getWage() {
        return wage;
    }

    public int getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        SocialSecurityNumber = socialSecurityNumber;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }

    public void displayInfo(){
        System.out.println("AD:"+ getName());
        System.out.println("SSN:" +getSocialSecurityNumber());
    }

    public void displaySalary(){
        System.out.println("SALARY:" + getWage()* getWorkingHours());
    }


}
