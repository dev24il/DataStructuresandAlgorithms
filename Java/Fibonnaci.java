import java.util.Scanner;

public class Fibonnaci {

    public static  boolean isPerfectSquare(int x){
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    public static boolean checkMember(int n){
		return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkMember(n));
    }
}
