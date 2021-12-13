import java.util.Scanner;

public class Test2b {

    public static void leaders(int[] input) {
        int size = input.length;
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (input[i] <= input[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(input[i] + " "); 
        } 
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        leaders(arr);
    }
}
