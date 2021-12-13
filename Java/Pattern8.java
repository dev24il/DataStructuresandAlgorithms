import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            int j=1;
            int ch = 65;
            while(j<=n){
                System.out.print((char)ch);
                j += 1;
                ch += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
