import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i=1;
        int p = 1;

        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print(p);
                j += 1;
            }
            System.out.println();
            i += 1;
            p += 1;
        }
    }
}
