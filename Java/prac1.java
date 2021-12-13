import java.util.Scanner;

public class prac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            long n = sc.nextLong();
            long a = 3;
            long b = 3;
            long c;
            for(long j=2;j<n;j++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(a);
        }
    }
}
