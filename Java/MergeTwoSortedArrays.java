import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeTwoSortedArrays(int[] arr1,int[] arr2) {
        int i=0,j=0,k=0;
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else if(arr1[i]>arr2[j]){
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        print(arr3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int j=1;j<=N;j++){
            int n = sc.nextInt();
            int arr1[] = new int[n];
            for(int i=0;i<arr1.length;i++){
                arr1[i] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int arr2[] = new int[n2];
            for(int i=0;i<arr2.length;i++){
                arr2[i] = sc.nextInt();
            }
            mergeTwoSortedArrays(arr1,arr2);
        }
    }
}
