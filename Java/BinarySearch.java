import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr,int x){
        int n = arr.length;

        int low = 0,high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        for(int j=1;j<=n;j++){
            int x = sc.nextInt();
            int ans = binarySearch(arr,x);
            System.out.println(ans);
        }
    }
}
