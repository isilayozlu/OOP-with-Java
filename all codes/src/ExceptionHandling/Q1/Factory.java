package ExceptionHandling.Q1;

public class Factory {
    Car[] cars;

    public Factory( Car[] cars){
        this.cars=cars;
    }

    public void printAllInfo(){
        for(Car car : cars){
            System.out.println(car.PrintAllCarInfos());
        }
    }
}
