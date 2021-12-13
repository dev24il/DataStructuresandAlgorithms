import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int x) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
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
            int search = sc.nextInt();
            int res = linearSearch(arr, search);
            System.out.println(res);
        }
    }
}
