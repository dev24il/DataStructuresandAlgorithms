package complexity;

import java.util.Scanner;

public class ArrayEquilibrium {

    public static int arrayEquilibriumIndex(int[] arr){  
        int n = arr.length,sum = 0,ans = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        for(int i = 0; i < n; i++){
            sum = sum - arr[i];
            // System.out.println(sum);
            // System.out.println(ans + " " + i);
            if(ans == sum){
                return i;
            }
            ans = ans + arr[i];
        }
        return -1;
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
            System.out.println(arrayEquilibriumIndex(arr));
        }

        sc.close();
    }
}
