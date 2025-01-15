package week1;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("AD:");
        String name= scanner.nextLine();

        System.out.println("SSN:");
        int SocialSecurityNumber= scanner.nextInt();

        System.out.println("WAGE:");
        float wage= scanner.nextFloat();

        System.out.println("WORKING HOURS");
        int WorkingHours =scanner.nextInt();

        Worker worker1 = new Worker(name,SocialSecurityNumber,wage, WorkingHours);

        scanner.close();

        worker1.displayInfo();
        worker1.displaySalary();
    }

}