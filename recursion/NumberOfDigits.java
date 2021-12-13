package recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int count(int n){
		if(n>=0 && n<=9){
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns+1;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }
}