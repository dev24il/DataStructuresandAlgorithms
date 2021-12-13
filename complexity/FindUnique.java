package complexity;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int[] arr) {
		//Your code goes here
        Arrays.sort(arr); 
        int n = arr.length; 
        int q = 0; 
        if(arr.length==1){ 
            return arr[0]; 
        } 
        for(int i=0;i<n-1;i++){ 
            if(arr[i]==arr[i+1]){
                i++; 
            }else{ 
                q = arr[i]; 
            } 
        } 
        if(arr[n-2]!=arr[n-1]){
            return arr[n-1];
        }
        return q;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int m = sc.nextInt();
            int[] arr = new int[m];
            for(int j=0;j<m;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(findUnique(arr));
        }

        sc.close();
    }
}
