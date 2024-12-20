import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter first name: ");
        String fname=sc.nextLine();
        System.out.println("enter last name: ");
        String Lname=sc.nextLine();
        System.out.println("full name is "+fname+ " "+Lname);

    }
}
