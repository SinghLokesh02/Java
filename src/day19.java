//This and Super Keyword in Java

class This{
    public int a;

    public void SetA(int a) {
//        a = a; This will not set the value of a
          this.a = a;// This will set the value of a
    }
    public void getA() {
        System.out.println("The value of a is : "+a);
    }
}

class Super_Check extends This{
    public Super_Check(){
        System.out.println("I am a base class Constructor");
    }
    public void Print(){
        System.out.println("I am a base Class Method");
        super.SetA(78);
        super.getA();

//        Super Keyword In Java
    }
}
public class day19 {
    public static void main(String[] args) {
//          This clas = new This();
//          clas.SetA(67);
//          clas.getA();

        Super_Check sc = new Super_Check();
        sc.Print();
    }
}


/*
The super keyword in Java is a reference variable that is used to refer to parent class objects. An understanding of Inheritance and Polymorphism is needed in order to understand the Java super keyword. The keyword “super” came into the picture with the concept of Inheritance.

Characteristics of super Keyword in Java
In Java, the super keyword is used to refer to the parent class of a subclass. Here are some of its characteristics:

super is used to call a superclass constructor: When a subclass is created, its constructor must call the constructor of its parent class. This is done using the super() keyword, which calls the constructor of the parent class.
super is used to call a superclass method: A subclass can call a method defined in its parent class using the super keyword. This is useful when the subclass wants to invoke the parent class’s implementation of the method in addition to its own.
super is used to access a superclass field: A subclass can access a field defined in its parent class using the super keyword. This is useful when the subclass wants to reference the parent class’s version of a field.
super must be the first statement in a constructor: When calling a superclass constructor, the super() statement must be the first statement in the constructor of the subclass.
super cannot be used in a static context: The super keyword cannot be used in a static context, such as in a static method or a static variable initializer.
super is not required to call a superclass method: While it is possible to use the super keyword to call a method in the parent class, it is not required. If a method is not overridden in the subclass, then calling it without the super keyword will invoke the parent class’s implementation.
Overall, the super keyword is a powerful tool for subclassing in Java, allowing subclasses to inherit and build upon the functionality of their parent classes.

Use of super Keyword in Java
It is majorly used in the following contexts as mentioned below:

Use of super with variables
Use of super with methods
Use of super with constructors

 */