package recursion;
import java.util.Scanner;

public class IsArraySorted {

    public static boolean isSorted(int[] a,int si){
        if(si==a.length-1){
            return true;
        }

        if(a[si]>a[si+1]){
            return false;
        }

        return isSorted(a,si+1);
    }

    public static boolean isSorted(int[] a){
        return isSorted(a,0);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));
        sc.close();
    }
}
