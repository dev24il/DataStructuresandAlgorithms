import java.util.Scanner;

public class MaximumElement {

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int maximumInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int max = maximumInArray(arr);
        System.out.println("Maximum element in the array is: " + max);
    }
}
