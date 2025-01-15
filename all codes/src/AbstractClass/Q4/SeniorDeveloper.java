package AbstractClass.Q4;

public class SeniorDeveloper extends RegularDeveloper implements PromotionBehaviour{
    public SeniorDeveloper(String fullName, int id, double monthlySalary){
        super(fullName, id,monthlySalary);
    }
    @Override
    public double getPromotion(){
        return 1.5*monthlySalary;
    }
    public double income(){
        return super.income()+getPromotion();
    }

    public String toString() {
        return String.format("Name %s ID:%d Promation: %.2f",fullName,id,getPromotion());
    }

}
