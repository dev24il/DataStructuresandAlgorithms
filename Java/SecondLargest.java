import java.util.Scanner;

public class SecondLargest {

    public static int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int flag = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=max && arr[j]>flag){
                flag = arr[j];
            }
        }
        return flag;
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
            int a = secondLargestElement(arr);
            System.out.println(a);
        }
    }
}
