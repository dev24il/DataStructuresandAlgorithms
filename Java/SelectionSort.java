import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
                int min = minTerm(arr,i);
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }
    }

    public static int minTerm(int arr[],int v) {
        int ptr = Integer.MAX_VALUE;
        int j = 0;
        for(int i=v;i<arr.length;i++){
            if(ptr>arr[i]){
                ptr = arr[i];
                j = i;
            }
        }
        return j;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
            selectionSort(arr);
            print(arr);
        }
    }
}
