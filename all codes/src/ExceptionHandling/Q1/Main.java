package ExceptionHandling.Q1;

public class Main {
    public static void main(String[] args) {
        try{
            Car car1= new Car(2014);
            Car car2= new Car(2015, "BMW");
            Car car3= new Car(2020, "FIAT", 1240);
            Car[] cars= new Car[]{car1,car2,car3};
            Factory factory= new Factory(cars);
            factory.printAllInfo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
