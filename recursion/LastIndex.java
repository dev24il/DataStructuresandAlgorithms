package recursion;
import java.util.Scanner;

public class LastIndex {

    public static int checkNumber(int input[],int x,int k){
        if(k==-1){
            return -1;
        }
        if(input[k]==x){
            return k;
        }
        return checkNumber(input, x, k-1);
    }

	public static int lastIndex(int input[], int x) {
        return checkNumber(input, x, input.length-1);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, x));
        sc.close();
    }
}
