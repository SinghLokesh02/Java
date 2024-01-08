public class rough {
    public static void main(String[] args) {
////        for loop
////        for (int u = 12;u<=50;u++)
////        {
////            System.out.println(u);
////
////        }
//
//       int x = 0;
//        while(x<=10){
//            System.out.println(x);
//            x++;
//        }
//
//        System.out.println("This is Do while loop");
//        int z = 1;
//        do{
//            System.out.println(z);
//            z++;
//        }while (z<=20);


//        ARRAYS IN JAVA

        int arr[] = {154,2,376,4,5,678,7,878,9,101123};

//        print by index
//        System.out.println(arr[0]);
//        System.out.println(arr[9]);

//        Print by loop
//        for (int i = 0; i <10; i++) {
//            System.out.println(arr[i]);
//        }

//        Change array Element By Index
//        System.out.println(arr[0]);
//        arr[0] = 56576;
//        System.out.println(arr[0]);

//      Find The length of the array
//        System.out.println(arr.length);
//
//        System.out.println(arr[arr.length-1]);



//        String in Java
        String name = "karan jeetu karan jeetu karan jeetu karan jeetu";
//        Print the string
        System.out.println(name);

//        FInd the size of the str
        System.out.println(name.length());


//        Print the char of array by index
        System.out.println(name.charAt(4));

//        Replace a substr in string
        System.out.println(name.replace("Jeetu","Jitendra"));
        System.out.println(name.replace("   ",""));

        System.out.println(name.isEmpty());

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.startsWith("Karan"));

        System.out.println(name.endsWith("tu "));

        System.out.println(name.indexOf("jeetu"));
        System.out.println(name.indexOf("lokesh"));

        System.out.println(name.lastIndexOf("karan"));

        System.out.println(name.equals("karan jeetu karan jeetu karan jeetu karan jeetu"));

        System.out.println(name.contains("jeetu"));
        System.out.println(name.contains("lokesh"));

        String name1 = "Lokesh ",name2 = "Singh";
        System.out.println(name1.concat(name2));

    }

}