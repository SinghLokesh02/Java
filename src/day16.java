//Constructors in Java
/*
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor,
memory for the object is allocated in the memory.

It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

Rules for creating Java constructor
There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized

There are two types of constructors in Java:

Default constructor (no-arg constructor)
Parameterized constructor

 */

class Baccha{
    String name;
    int age;
    int Numoftoys;
    public Baccha(String name1,int age1,int numoftoys1){ // Here is the Constructor of Java
        name = name1;
        age = age1;
        Numoftoys = numoftoys1;
    }
    public void print_data(){
        System.out.println("The name is : "+name);
        System.out.println("The Age is : "+age);
        System.out.println("The Number of toys is : "+Numoftoys);
    }
}

public class day16 {

    public static void main(String[] args) {

        Baccha anu = new Baccha("Kittu",3,6);

        anu.print_data();
    }
}