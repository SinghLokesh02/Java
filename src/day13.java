import java.util.Scanner;

//Java VarArgs
public class day13 {
    static void print(int arr[]){
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

//    Using VarArgs
//static void print(int ...arr){
//    for (int i = 0;i< arr.length;i++){
//        System.out.println(arr[i]);
//    }
//}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//  Print the array by methods
        print(arr);
    }
}