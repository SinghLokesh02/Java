// Constructor in Inheritance
class Base{
    public  Base(){
        System.out.println("I am a Base Class Constructor");
    }
}

class derived extends Base{
    public  derived(){
        System.out.println("I am a Derived Class Constructor");
    }
}

public class day18 {
    public static void main(String[] args) {
//        Base b = new Base(); -> This will call base class Constructor
          derived d = new derived();//-> Derived Class Constructor
//        If We have Constructor in both Base as well in Derived class then I we create a derived class Constructor
//        Then first Base class constructor will be called the base class constructor should be called.

    }
}