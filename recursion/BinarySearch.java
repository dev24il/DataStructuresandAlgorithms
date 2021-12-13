package recursion;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int a[],int si,int ei,int x){
        if(si > ei){
            return -1;
        }
        int midIndex = (si+ei)/2;
        if(a[midIndex] == x){
            return midIndex;
        }else if(a[midIndex]>x){
            return binarySearch(a, si, midIndex-1, x);
        }else{
            return binarySearch(a, midIndex+1, ei, x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(binarySearch(arr, 0, arr.length, x));
        sc.close();
    }
}
