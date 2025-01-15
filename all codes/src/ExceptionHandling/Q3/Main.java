package ExceptionHandling.Q3;

public class Main {
    public static void main(String[] args) {
        try {
            Person p1 = new Person(22);
            System.out.printf("NAME: %s AGE:%d", p1.getName(), p1.getAge());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
