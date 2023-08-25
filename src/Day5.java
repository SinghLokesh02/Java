public class Day5 {
    public static void main(String[] args) {
//        In this lecture we are going to learn java math class
        int num1 = 20;
        int num2 = 35;

        System.out.println(Math.max(num1,num2));
        System.out.println(Math.min(num1,num2));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-90));
        System.out.println(Math.ceil(7.890)); //-> Ceil Increase by 1
        System.out.println(Math.floor(7.890));// floor Decrease by 1
//  Generate random Numbers
        System.out.println(Math.random());

//  Generate Random Number between 1 - 100
        int ran = (int)(Math.random() * 101);
        System.out.println(ran);


        System.out.println(Math.round(7.89));

        System.out.println(Math.pow(2,5));
    }
}