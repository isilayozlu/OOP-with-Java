package week2;

public class Student {
    private String name;
    private int midterm;
    private int ffinal;

    public Student(String name, int midterm, int ffinal){
        this.name=name;
        this.midterm=midterm;
        this.ffinal=ffinal;
    }

    public String getName() {
        return name;
    }

    public int getFfinal() {
        return ffinal;
    }

    public int getMidterm() {
        return midterm;
    }

    public double ortalamaHesapla(){
        return (getMidterm()*0.4)+(getFfinal()*0.6);
    }

    public void bilgileriYazdir(){
        System.out.println("AD      :" +getName());
        System.out.println("MIDTERM :" +getMidterm());
        System.out.println("FINAL    :" +getFfinal());
        System.out.printf("ORTALAMA: %.2f" , ortalamaHesapla());

    }

}
