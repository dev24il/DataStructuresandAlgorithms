import java.util.Scanner;

public class ArrangeNumbers {

    public static void arrange(int[] arr, int n) {
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                arr[i] = 2*i+1;
            }
            int k = 0;
            for(int j=n/2;j<n;j++){
                arr[j] = n-2*k;
                k++;
            }
        }else{
            for(int i=0;i<=n/2;i++){
                arr[i] = 2*i+1;
            }
            int k = 0;
            for(int j=n/2+1;j<n;j++){
                arr[j] = n-2*k-1;
                k++;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            arrange(arr, n);
            printArray(arr);
        }
    }
}
