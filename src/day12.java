import java.util.Scanner;

// Method Overriding
/*
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding

Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism

Rules for Java Method Overriding

The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
 */

public class day12 {
    static void sum(int a,int b){
        System.out.println("The sum of 2 number is : "+(a+b));
    }
    static void sum(int a,int b,int c){
        System.out.println("The sum of 3 numbers is : "+(a+b+c));
    }
    static void sum(int a,int b,int c,int d){
        System.out.println("The sum of 4 numbers is : "+(a+b+c+d));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Number1");
        int num1 = sc.nextInt();

        System.out.println("Enter the value of Number2");
        int num2 = sc.nextInt();

        System.out.println("Enter the value of Number3");
        int num3 = sc.nextInt();

        System.out.println("Enter the value of Number4");
        int num4 = sc.nextInt();

        sum(num1,num2);

        sum(num1,num2,num3);

        sum(num1,num2,num3,num4);


    }
}