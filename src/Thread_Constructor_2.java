// Creating a Thread By Implement Runnable Interface of Java

class MyThr1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<=10){
            System.out.println("This is Printing");
            System.out.println("I'm implementing thread 1 class");
            i++;
        }

    }
}
class MyThr2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<=10){
            System.out.println("This is Writing");
            System.out.println("I'm implementing thread 2 class");
            i++;
        }
    }
}
public class Thread_Constructor_2 {
    public static void main(String[] args) {
        MyThr1 first = new MyThr1();
        Thread t1 = new Thread(first,"Lokesh");
        System.out.println("The name of Thread is : "+t1.getName());
        System.out.println("The Id of Thread is : "+t1.getId());

        MyThr2 second = new MyThr2();
        Thread t2 = new Thread(second,"Diwakar");
        System.out.println("The Id of Thread is : "+t2.getId());
        System.out.println("The name of Thread is : "+t2.getName());

        t1.start();
        t2.start();
    }
}
