import java.util.Scanner;

public class ArraySum {

    public static int sum(int[] arr) {
        int n = arr.length;
        int su = 0;
        for(int k=0;k<n;k++){
            su += arr[k];
        }
        return su;
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
            int su = sum(arr);
            System.out.println(su);
        }
    }
}
