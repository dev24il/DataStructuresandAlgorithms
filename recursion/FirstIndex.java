package recursion;
import java.util.Scanner;

public class FirstIndex {

    public static int checkNumber(int input[], int x, int startIndex) { 
        if(startIndex == input.length) { 
            return -1; 
        }
        if(input[startIndex] == x) { 
            return startIndex; 
        } 
        return checkNumber(input, x, startIndex + 1); 
    }

    public static int firstIndex(int input[], int x) {
		return checkNumber(input, x, 0);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(arr, x));
        sc.close();
    }
}
