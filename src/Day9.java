public class Day9 {
    public static void main(String[] args) {
        // Declaration of array in Java
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {90,65,76,76,45,43,32,12,54,32};
        // Print the array element using index
        System.out.println(arr[3]);
        // Change the array element by index
        System.out.println("The first position element before change "+arr[0]);
        arr[0] = 90;
        System.out.println("The first position element after change "+arr[0]);


        // Print all the array element using loop
        System.out.println("Printing the first array Elements");
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nPrinting the second array Elements\n");
        for (int i = 0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
//    for each loop in Java array
        System.out.println("Printing the value of array using for each loop");
        for(int i :arr){
            System.out.println(i);
        }
    }
}