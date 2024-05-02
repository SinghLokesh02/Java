// Creating a Thread By Implement Runnable Interface of Java

class MyThread1 implements Runnable{
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
class MyThread2 implements Runnable{
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
public class Thread_lecture2 {
    public static void main(String[] args) {
     MyThread1 first = new MyThread1();
     Thread t1 = new Thread(first);
     MyThread2 second = new MyThread2();
     Thread t2 = new Thread(second);

     t1.start();
     t2.start();
    }
}
