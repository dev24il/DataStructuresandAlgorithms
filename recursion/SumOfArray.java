package recursion;

import java.util.Scanner;

public class SumOfArray {

    public static int sum(int input[]) {
		if(input.length==1){
            return input[0];
        }

        int smallArray[] = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallArray[i-1] = input[i];
        }
        
        return input[0] + sum(smallArray);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
        sc.close();
    }
}
