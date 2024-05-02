// Creating a thread using extending the Thread Class of Java

class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<=100){
            System.out.println("This is Printing");
            System.out.println("I'm implementing thread 1 class");
            i++;
        }

    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<=100){
            System.out.println("This is Writing");
            System.out.println("I'm implementing thread 2 class");
            i++;
        }
    }
}
public class Theading_lecture1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
