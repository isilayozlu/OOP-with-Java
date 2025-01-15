package Array.Q1;

public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter;

    public Car(int id, int productionYear){
        this.id=id;
        this.productionYear=productionYear;
        counter++;
    }
    public void setPower(int power){
        this.power=power;
    }
    public int getProductionYear(){
        return productionYear;
    }
    public int getAge(){
        return 2024-productionYear;
    }
    public String toString(){
        return String.format("ID:%d PY:%d POWER:%d COUNTER:%d", this.id,this.productionYear,this.power, counter);
    }

}
