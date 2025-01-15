package AbstractClass.Q4;

public class Main {
    public static void main(String[] args) {
        Developer d1= new FreelancerDeveloper("isil    ", 1, 40);
        Developer d2= new SeniorDeveloper("ayse    ", 2,40);
        Developer d3= new RegularDeveloper("nazlican", 3, 40);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
