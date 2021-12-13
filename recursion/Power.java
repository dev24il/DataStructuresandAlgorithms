package recursion;
import java.util.Scanner;

public class Power {

    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int smallOutput = power(x,n-1);
        int output = x * smallOutput;
        return output;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
        sc.close();
    }
}
