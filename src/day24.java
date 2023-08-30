//Java Interface Example and Default Methods
interface Parent4{
    public void greet();
    public void gift();
//  public void food(); If I just write like this then we have to implement the food method in all the cl
// classes who are using parent4 interface otherwise the class will show error "Class 'Baccha5' must either be declared
// abstract or implement abstract method 'food()' in 'Parent4" so to fix this we have a default method but we have to
//  implement the method in the interface after implementing the method we can override the method in the derived class/classes
//  as well if we want
//    Ex
    default public void food(){
        System.out.println("hey beta I have nice food for you");
    }
}

class Parent5{
    public Parent5(){
        System.out.println("I am a parent Class Constructor");
    }
    public void check(){
        System.out.println("I am check your are sleeping or not");
    }
}

// Now this class Can have features of both above classes
class Baccha5 extends Parent5 implements Parent4 {
    public void greet(){
        System.out.println("Hello Beta Kaise ho?");
    }
    public void gift(){
        System.out.println("Beta this is a gift For you");
    }
    public void check(){
        System.out.println("I am here baccha to check you are sleeping or not");
    }
// Overridding the food default method in the derived class
//    public void food(){
//        System.out.println("Yes Maa ❤️ the food was really nice");
//    }

}
public class day24 {
    public static void main(String[] args) {
        Baccha5 b2 = new Baccha5();
        b2.check();
        b2.greet();
        b2.gift();
        b2.food();
    }


}