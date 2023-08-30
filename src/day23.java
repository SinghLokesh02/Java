// Is Multiple Inheritance Supported by Java ??

/*

Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than
one parent class. The problem occurs when there exist methods with the same signature in both the superclasses and
subclass. On calling the method, the compiler cannot determine which class method to be called and even on calling
which class method gets the priority.

Note: Java doesn’t support Multiple Inheritance

How are the above problems handled for Default Methods and Interfaces?
Java 8 supports default methods where interfaces can provide a default implementation of methods. And a class can
implement two or more interfaces. In case both the implemented interfaces contain default methods with the same method
signature, the implementing class should explicitly specify which default method is to be used in some method excluding
the main() of implementing class using super keyword, or it should override the default method in the implementing c
lass, or it should specify which default method is to be used in the default overridden method of the implementing
class
 */


/*

In short Terms
Java doesn't Support Multiple Inheritance beacause of following reason


Java doesn't support multiple inheritance due to several design considerations and language features that prioritize
simplicity, maintainability, and avoiding ambiguity. Here are the key points that explain why Java chose not to support
multiple inheritance:

Diamond Problem: Multiple inheritance can lead to the "diamond problem," where a class inherits from two classes that
have a common superclass. This can cause ambiguity when the subclass tries to access members of the common superclass
 through its two parent classes. Java's goal is to provide a clear and unambiguous inheritance model.

Complexity: Multiple inheritance can make the code more complex and harder to understand. It can lead to conflicts and
difficulties in determining which method or field from which parent class should be inherited when there are naming
collisions.

Maintainability: Multiple inheritance can make the codebase harder to maintain and debug, especially as the complexity
of the hierarchy increases. It can lead to unexpected interactions between different parent classes, making it challenging
to identify and resolve issues.

Interface Implementation: Java introduced interfaces as a way to achieve abstraction and define contracts without the
complexities of multiple inheritance. Interfaces allow a class to implement multiple contracts, avoiding ambiguity and
the diamond problem.

Focus on Composition: Java promotes composition over inheritance. This means that rather than inheriting behavior from
multiple classes, you can create new classes by combining existing ones through composition. This approach generally
leads to more flexible and maintainable code.

Clear Class Hierarchy: Java's single inheritance model results in a clearer and more predictable class hierarchy.
Each class has a single direct superclass, which helps developers understand and navigate the structure of the codebase.

Ease of Learning: Java is designed to be a beginner-friendly language. Avoiding multiple inheritance simplifies the
language and reduces the learning curve for new programmers who might be unfamiliar with the complexities it introduces.

By prioritizing these considerations, Java aims to provide a clean and understandable object-oriented programming model
that is easy to work with, reduces errors, and supports software development practices that emphasize code clarity and
 maintainability.

java has better method to resolve this issue using inheritance and
interfaces

Below is the code Illustrating the multiple Inheritance
 */


/*
// Syntax
public class MyClass extends Superclass implements Interface1, Interface2 {
    // Class body
}
  */

interface Parent3{
    public void greet();
    public void gift();
}

class Parent{
    public Parent(){
        System.out.println("I am a parent Class Constructor");
    }
    public void check(){
        System.out.println("I am check your are sleeping or not");
    }
}

// Now this class Can have features of both above classes
  class Baccha2 extends Parent implements Parent3 {
    public void greet(){
        System.out.println("Hello Beta Kaise ho?");
    }
    public void gift(){
        System.out.println("Beta this is a gift For you");
    }
    public void check(){
        System.out.println("I am here baccha to check you are sleeping or not");
    }

}
public class day23 {
    public static void main(String[] args) {
    Baccha2 b2 = new Baccha2();
    b2.check();
    b2.greet();
    b2.gift();
    }
}