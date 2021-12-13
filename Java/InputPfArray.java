import java.util.Scanner;

public class InputPfArray {

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element at " + i + " index:");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       
        int[] arr = takeInput();
        printArray(arr);
    }
}
