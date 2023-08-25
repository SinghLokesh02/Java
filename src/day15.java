//Getter setter in Java

/*

Get and Set
You learned from the previous chapter that private variables can only be accessed within the same class (an outside class
has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
 */
class Employee{
    private String name;
    private int id;

    public void setdata(String name1, int id1){
        name = name1;
        id = id1;
    }
    public void getData(){
        System.out.println("The name of the Employee is : "+name);
        System.out.println("The id of the Employee is "+id);
    }
}
public class day15 {
    public static void main(String[] args) {
        Employee lokesh = new Employee();

//        The below is possible in case of public and default acess specifier
//        lokesh.name = "Lokesh Singh";
//        lokesh.id = 45;

//        If the attributes are private then we have to use getter and setters
        lokesh.setdata("Lokesh Singh",25);
        lokesh.getData();
    }
}