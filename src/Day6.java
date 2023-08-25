import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
// In this lecture we are going to learn about Conditional Statements in Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = sc.nextInt();
        if(age >=18){
            System.out.println("Yes you can Vote");
        }
        else{
            System.out.println("You cannot Vote");
        }

//  If else Ladder
        System.out.println("Would you please Enter Your age Again ");
        int age_again = sc.nextInt();
        if(age_again<1){
            System.out.println("Invalid Age");
        }
        else if(age_again>10 && age_again<=17){
            System.out.println("Please Enjoy Your life you have time");
        }
        else if(age_again>=18 && age_again<=25){
            System.out.println("Yes you can vote man");
        }
        else if(age_again>25 && age_again<=30){
            System.out.println("Common man get Married");
        }
        else if(age_again>80){
            System.out.println("You have less time start chanting");
        }
        else{
            System.out.println("Case not Matched");
        }
    }
}