import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
//  Switch Statement In Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = sc.nextInt();
        switch (age){
            case 5:
                System.out.println("Your age is 5 Now");
                break;
            case 18:
                System.out.println("Your age is 18 Now");
                break;
            case 20:
                System.out.println("Your age is 20 Now");
                break;
            case 25:
                System.out.println("Your age is 25 Now");
                break;
            default:
                System.out.println("Case Not Matched");
        }


//  Enhanced Switch Statement of Java
        switch (age) {
            case 5 -> System.out.println("Your age is 5 Now");
            case 18 -> System.out.println("Your age is 18 Now");
            case 20 -> System.out.println("Your age is 20 Now");
            case 25 -> System.out.println("Your age is 25 Now");
            default -> System.out.println("Case Not Matched");
        }
    }
}