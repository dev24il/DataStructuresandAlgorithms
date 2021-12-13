import java.util.Scanner;

public class PairSum {
    public static void sortZeroesAndOne(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right){
            if(arr[left]==0){
                left++;
            }
            else if(arr[left]!=0 && arr[right]==1){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
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
            sortZeroesAndOne(arr);
        }
    }
}
