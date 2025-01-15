package AbstractClass.Q4;

public class RegularDeveloper extends Developer {
    public double monthlySalary;


    @Override
    public double income(){
        return monthlySalary;
    }

    public RegularDeveloper(String fullName, int id, double monthlySalary){
        super(fullName, id);
        this.monthlySalary=monthlySalary;
    }

    public String toString() {
        return String.format("Name %s ID:%d Monthly Salary: %.2f",fullName,id,monthlySalary);
    }
}
