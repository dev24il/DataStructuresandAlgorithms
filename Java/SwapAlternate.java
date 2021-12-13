import java.util.Scanner;

public class SwapAlternate {

    public static void swapAlternate(int arr[]) {
        int n = arr.length;
        if(n%2==0){
            for(int i=0;i<n;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            }
        }else{
            for(int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            }
        }

        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            swapAlternate(arr);
        }
    }
}
