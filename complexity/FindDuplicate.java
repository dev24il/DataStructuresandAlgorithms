package complexity;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {

    public static int findDuplicate(int[] arr) {
		//Your code goes here
        Arrays.sort(arr); 
        int n = arr.length; 
        int q = 0; 
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                q = arr[i];
                break;
            }
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
            System.out.println(findDuplicate(arr));
        }

        sc.close();
    }
}
