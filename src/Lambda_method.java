// Lambda Expressions were added in Java 8.
interface Person{
    public void Discipline();
}

//    Method 1 For Implementing Interface
//class  Lokesh implements Person{
//    public void Discipline(){
//        System.out.println("Discipline in Student is must");
//    }
//}
public class Lambda_method {

    public static void main(String[] args) {
//        Method 1 of Implementing Interface having single method
//        Lokesh lokesh = new Lokesh();
//        lokesh.Discipline();

//        Method - 2
        Person lokesh = ()->{
            System.out.println("Discipline in Student is must");
        };
        lokesh.Discipline();
    }
}