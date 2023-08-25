import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
//  Taking User Input in Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Please Enter Your Name");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Please Enter Your Email");
        String email = sc.nextLine();

        System.out.println("The data Entered by User : \n");
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);

    }
}