import java.util.Scanner;

public class ArrayRotation {

    public static int arrayRotation(int[] arr){
        int min = Integer.MIN_VALUE, min_index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
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
            int a = arrayRotation(arr);
            System.out.println(a);
        }
    }
}
