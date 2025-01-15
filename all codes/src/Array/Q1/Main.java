package Array.Q1;

public class Main {
    public static void main(String[] args){
        Car car1= new Car(1, 2022);
        Car car2= new Car(2, 2000);
        Car car3= new Car(3, 2019);
        Car car4= new Car(4, 2000);

        Car[] cars =new Car[]{ car1, car2, car3, car4};
        Garage garage= new Garage(cars);
        garage.printCarsOlderThan(5);
    }

}
