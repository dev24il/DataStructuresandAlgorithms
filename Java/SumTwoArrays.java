import java.util.Scanner;

public class SumTwoArrays {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int j=1;j<=N;j++){
            int n1 = sc.nextInt();
            int arr1[] = new int[n1];
            for(int i=0;i<arr1.length;i++){
                arr1[i] = sc.nextInt();
            }

            int n2 = sc.nextInt();
            int arr2[] = new int[n2];
            for(int i=0;i<arr2.length;i++){
                arr2[i] = sc.nextInt();
            }

            int m = 0;
            if(n1>=n2){
                m = n1;
            }else{
                m = n2;
            }
            int output[] = new int[m+1];
            sumOfTwoArrays(arr1, arr2, output);
            print(output);
        }
    }
}
