package ExceptionHandling.Q1;

public class Car {
    private String brand;
    private int maxSpeed;
    private int year;

    Car(int year){
        this.year=year;
    }
    Car (int year, String brand){
        this.year=year;
        this.brand=brand;
    }
    Car(int year, String brand, int maxSpeed){
        setYear(year);
        setBrand(brand);
        setMaxSpeed(maxSpeed);
    }

    public void setYear(int year){
        if(year > 2024)
            throw new IllegalArgumentException("year cannot be grater then 2024");
        this.year=year;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setMaxSpeed(int maxSpeed){
        if(maxSpeed> 1000)
            throw new IllegalArgumentException("speed cannot be over 1000, are you use a spaceship??");
        this.maxSpeed=maxSpeed;
    }

    public int getYear(){
        return year;
    }
    public String getBrand(){
        return brand;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String PrintAllCarInfos(){
        return String.format ("YEAR:%d BRAND:%s MAXSPEED:%d", this.year ,this.brand, this.maxSpeed);
    }

}
