public class Thread_Constructor_1 {
    public static void main(String[] args) {
        MyThread lk = new MyThread("Lokesh");
        lk.run();
        System.out.println("The Id of thread is : "+ lk.getId());
        System.out.println("The name of Thread is : "+lk.getName());

        MyThread dibbi = new MyThread("Diwakar Singh");
        dibbi.run();
        System.out.println("The Id of thread is : "+ dibbi.getId());
        System.out.println("The name of Thread is : "+dibbi.getName());
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hey there I am a Thread");
    }
}