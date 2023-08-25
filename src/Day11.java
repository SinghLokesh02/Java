import java.util.Scanner;

// Java Methods
/*
A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.
 */
public class Day11 {
    public static void sum(int a,int b){
        System.out.println("The sum of two number is : "+(a+b));
    }

    public static boolean check_prime(int num){
        if(num<2)return false;
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2");
        int num2 = scan.nextInt();
        sum(num2,num1);

        if(check_prime(num1)){
            System.out.println("Number 1 is a prime Number");
        }
        else{
            System.out.println("Number 1 is not Prime");
        }
        if(check_prime(num2)){
            System.out.println("Number 2 is a prime Number");
        }
        else{
            System.out.println("Number 2 is not Prime");
        }
    }
}