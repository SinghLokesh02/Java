public class Day4 {
    public static void main(String[] args) {
//   In This Lecture we are going to learn string Method in Java
        String name = "lokesh Singh";
//  Method to print the length of string
        System.out.println(name.length());

//  Method to get character by index
        System.out.println(name.charAt(3));

//  Concat method
        System.out.println(name.concat(" is a good boy"));

//  Check whether String contains a sequence of alphabets
        System.out.println(name.contains("Singh"));

//  Equals Compare two str and return true if they are equal
        String name1 = "lokesh Singh";
        System.out.println(name.equals(name));

//  Endswith check whether the string endswith the specified character
        System.out.println(name.endsWith("Singh1"));

//  Get index of str or substr in main string
        System.out.println(name.indexOf("Singh"));

//  Check whether the string is Empty or not
        System.out.println(name.isEmpty());

//   Find the last Index of char or substr
        System.out.println(name.lastIndexOf("h"));


//   Compares two strings, ignoring case considerations
        System.out.println(name.compareToIgnoreCase("LOKESH SINGH"));

//  Convert to lowercase
        System.out.println(name.toLowerCase());


//  Convert to UpperCase
        System.out.println(name.toUpperCase());

//   Startswith()
//   replace()
//   replaceAll()
//   replaceFirst()

//        https://www.w3schools.com/java/java_ref_string.asp
    }
}