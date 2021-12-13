import java.util.Scanner;

public class PushZeroesAtEnd {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void pushZerosAtEnd(int[] arr) {
        int n = arr.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[i]!=0 && arr[j]!=0){
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0){
                i++;
            }
            else if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
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
            pushZerosAtEnd(arr);
            print(arr);
        }
    }
}
