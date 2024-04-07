import java.util.Scanner;

public class Revision_day1 {
    public static void main(String[] args) {
        // Hello World Code
        System.out.println("Hello World");


//        Operators in Java
        int a = 10;
        int b = 20;
//        1) Arithmetic Operator
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        2) Assignment Operator
        int x = 15;
        System.out.println(x);

        x += 10;
        System.out.println(x);

        x -= 20;
        System.out.println(x);

        x *= 30;
        System.out.println(x);

        x /= 40;
        System.out.println(x);

//        Comparison Operators

        System.out.println(x > a);
        System.out.println(x >= a);
        System.out.println(x < a);
        System.out.println(x <= a);
        System.out.println(x == a);
        System.out.println(x != a);


//        Logical Operator

//        And
        System.out.println(a > b && b != a);
//        Or
        System.out.println(a > b || b != a);
//        Not
        System.out.println(!(a > b || b != a));

//        User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name Input : ");
        String name = sc.nextLine();
        System.out.println("You Name is : "+name);


//        If Else Conditional Statement
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        if(age>0 && age <=5){
            System.out.println("Infant");
        }
        else if(age>5 && age<=10){
            System.out.println("Child");
        }
        else if(age>10 && age<=20){
            System.out.println("Teenager");
        }
        else if(age>20 && age<=40){
            System.out.println("Earn and save");
        }
        else if(age>40 && age<=60){
            System.out.println("Last Time of Job");
        }
        else{
            System.out.println("Retirement");
        }


//        Loop


//        For Loop
        System.out.println("\n\nFor Loop\n\n");

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(num*i);
        }

//       While Loop
        System.out.println("\n\nWhile Loop\n\n");
        int num1 = 1;
        while (num1 <= 10){
            System.out.println(num1);
            num1++;
        }


//        Do While Loop
        System.out.println("\n\nDo While Loop\n\n");
        num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        }while (num1 <= 10);


   }
}