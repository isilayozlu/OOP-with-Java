package Array.Q1;

public class Garage {
    private Car[] cars;

    public Garage(Car[] cars){
        this.cars=cars;
    }
    public void printCarsOlderThan(int age){
        System.out.printf("yaşı %d den büyük olan araçlar", age);
        for( Car car : cars){
            if(age < car.getAge()){
                System.out.println(car.toString());
            }}
    }

}
