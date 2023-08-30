//Abstract Method/Abstract Class in Java

/*
An abstract class in Java is one that is declared with the abstract keyword. It may have both abstract and non-abstract methods(methods with bodies).
An abstract is a java modifier applicable for classes and methods in java but not for Variables. In this article, we will learn the use of abstract class in java.

What is Abstract class in Java?
Java abstract class is a class that can not be initiated by itself, it needs to be subclassed by another class to use its properties.
An abstract class is declared using the “abstract” keyword in its class definition.

Illustration of Abstract class
abstract class Shape
{
    int color;
    // An abstract function
    abstract void draw();
}


If a class Have Abstract method init then the class should also be abstract and if you don't want to add abstract
in your class beginning then avoid using abstract method
*/


abstract class Parent2{
    public Parent2(){
        System.out.println("I am a Base2 Constructor");
    }
    public void  sayhello(){
        System.out.println("Hello");
    }
    abstract public void  Greet();
}

class Child2 extends Parent2{
    @Override
    public void Greet() {
        System.out.println("Good Morning");
    }
}

class Child3 extends Parent2{
    @Override
    public void Greet() {
        System.out.println("Good Evening");
    }
}
public class day20 {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.Greet();
        Child3 c3 = new Child3();
        c3.Greet();
    }
}

//Note -> We cannot create a obj of a abstract class
// Yes we can create I we Implement the abstract method of the class or we can
// Create obj of the child class of the abstract class
