public class Day8 {
    public static void main(String[] args) {
// In this lecture we are going to learn about loops in Java
        /*
        There are 3 basic loops in Java
        1) For loop
        2) While loop
        3) Do while loop
         */
// For Loop
        System.out.println("This is a For loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//  While loop
        System.out.println("\n\nNow its time for while loop");
        int a = 1;
        while (a <= 10){
            System.out.println(a);
        a++;
    }
        System.out.println();


//  Do- While loop
        System.out.println("\n\nNow its time for Do-while loop");
        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while (x<=10);


//  Break Statement -> Whenever the break condition occur break the loop there
        System.out.println("Example of Break Statement");
        for(int i = 0;i<=5;i++) {
            if (i == 2) break;
            System.out.println(i);
        }

//  Continue Statement -> leave the continue condition and jump to next one
        System.out.println("Example of Continue Statement");
        for(int i = 1;i<=5;i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }
}