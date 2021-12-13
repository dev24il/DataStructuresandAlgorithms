package complexity;

import java.util.Arrays;
import java.util.Scanner;


public class Intersection {

    public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0,k=0,l=0;
        if(arr1.length>=arr2.length){
            l = arr2.length;
        }else{
            l = arr1.length;
        }

        int[] brr = new int[l];
        while(i!=arr1.length && j!=arr2.length){
            if(arr1[i]==arr2[j]){
                brr[k] = arr1[i];
                k++;
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        for(int g=0;g<k;g++){
            System.out.print(brr[g] + " ");
        }
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int m = sc.nextInt();
            int[] arr1 = new int[m];
            for(int j=0;j<m;j++){
                arr1[j] = sc.nextInt();
            }
            int n = sc.nextInt();
            int[] arr2 = new int[n];
            for(int j=0;j<n;j++){
                arr2[j] = sc.nextInt();
            }
            intersection(arr1, arr2);
        }

        sc.close();
    }
}
