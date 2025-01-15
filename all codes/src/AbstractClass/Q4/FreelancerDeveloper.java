package AbstractClass.Q4;

public class FreelancerDeveloper extends Developer implements BonusSalaryBehavior{
    public int unitPrice;
    public int hours;

    @Override
    public double getBonusSalary(){
        return hours*1.5;
    }

    double income(){
        return hours*unitPrice + getBonusSalary();
    }

    public FreelancerDeveloper(String fullName, int id, int hours){
        super(fullName, id);
        this.hours=hours;
    }

    public String toString() {
        return String.format("Name %s ID:%d Bonus Salary: %.2f",fullName,id,getBonusSalary());
    }
}
