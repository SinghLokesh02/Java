//Introduction to OOPs In Java
class Student{
    int roll = 25;
    String name = "Lokesh Singh";
    int contact= 123456;
    public void print_data(){
        System.out.println("The name is : "+name);
        System.out.println("The roll is : "+roll);
        System.out.println("The contact is : "+contact);
    }

};
public class day14 {

    public static void main(String[] args) {
        Student lokesh = new Student(); // Instantiating new Student Obj
        lokesh.name = "Lokesh Singh";
        lokesh.contact = 12345;
        lokesh.roll = 25;
//        System.out.println(lokesh.name);
//        System.out.println(lokesh.contact);
//        System.out.println(lokesh.roll);

        lokesh.print_data();
        Student sonali = new Student(); // Instantiating new Student Obj
        sonali.name = "sonali Singh";
        sonali.contact = 12345678;
        sonali.roll = 58;

        sonali.print_data();
    }
}