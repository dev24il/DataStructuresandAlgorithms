import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int[] arr){
        int n = arr.length;
        int find = 0;
        for(int i=0;i<n-1;i++){
            int k = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    k += 1;
                }
            }
            if(k==1){
                find = arr[i];
            }
        }
        return find;
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
            System.out.println(findUnique(arr));
        }
    }
}