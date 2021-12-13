import java.util.Scanner;

public class RoatateArray {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int arr[],int no){
        for(int i=0;i<no/2;i++){
            int temp = arr[i];
            arr[i] = arr[no-i-1];
            arr[no-i-1] = temp;
        }
    }

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr,d);
        reverse(arr,n);
        reverse(arr,n-d);
        print(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int j=1;j<=N;j++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            rotate(arr, x);
        }
    }
}
