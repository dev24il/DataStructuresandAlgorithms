import java.util.Scanner;

public class Sort01 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort01(int[] arr){
        int nextZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[nextZero];
            arr[nextZero] = arr[i];
            arr[i] = temp;
            nextZero++;
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
            sort01(arr);
            print(arr);
        }
    }
}
