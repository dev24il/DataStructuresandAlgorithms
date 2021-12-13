import java.util.Scanner;
import java.lang.Math;

public class SumOfTwoArrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int m = arr1.length-1,n = arr2.length-1;
        int k = output.length-1;

        int carry = 0;
        while(m>=0 && n>=0){
            int sum = arr1[m] + arr2[n] + carry;
            output[k] = sum%10;
            carry = sum/10;
            k-=1;
            m-=1;
            n-=1;
        }

        while(m>=0){
            int sum = arr1[m] + carry;
            output[k] = sum%10;
            carry = sum/10;
            m -= 1;
            k -= 1;
        }

        while(n>=0){
            int sum = arr2[n] + carry;
            output[k] = sum%10;
            carry = sum/10;
            n-=1;
            k-=1;
        }

        output[0]=carry;
    }

    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            for(int j=0;j<n1;j++){
                arr1[j] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            for(int j=0;j<n2;j++){
                arr2[j] = sc.nextInt();
            }
            int k = Math.max(n1,n2);
            int[] output = new int[k];
            sumOfTwoArrays(arr1, arr2, output);
            print(output);
        }
    }
}
