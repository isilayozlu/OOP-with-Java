package week2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("NAME:");
        String name= scanner.nextLine();

        System.out.println("MIDTERM:");
        int midterm= scanner.nextInt();

        System.out.println("FINAL:");
        int ffinal = scanner.nextInt();

        Student s1 = new Student(name,midterm,ffinal);
        s1.bilgileriYazdir();
        scanner.close();
    }
}
