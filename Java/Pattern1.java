import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print('*');
                j += 1;
            }
            i += 1;
            System.out.println();
        }
    }
}
