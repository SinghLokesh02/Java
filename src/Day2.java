public class Day2 {
    public static void main(String[] args) {
    /*
    Operators in Java
    1) Arithmetic Operator
    2) Logical Operator
    3) Comparison Operator
    4) Assignment Operator

     */
//Arithmetic Operator ->(+,-,*,/,%)
        int a = 100,b = 21;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


// Logical Operator in Java
    boolean x = true,y=false;
        System.out.println(x==false && y==false);
        System.out.println(x==true || y==true);


//  Relation Operator in Java
    int num1 = 10;
    int num2 = 20;
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);

//  Assignment Operator(=,+=,-=,/=,*=)
        int assn = 10;
        System.out.println(assn);
        assn += 10;
        System.out.println(assn);
        assn -= 10;
        System.out.println(assn);
        assn *= 10;
        System.out.println(assn);
        assn /= 10;
        System.out.println(assn);

//  Increment Operator
        System.out.println("Increment Operator \n");
        System.out.println(assn++); // Post Increment Operator first print then increment
        System.out.println(assn);
        System.out.println(++assn); // Pre Increment Operator first increment then print
        System.out.println();

//  Decrement Operator
        System.out.println("Decrement Operator \n");
        System.out.println(assn--);
        System.out.println(assn);
        System.out.println(--assn);
    }
}