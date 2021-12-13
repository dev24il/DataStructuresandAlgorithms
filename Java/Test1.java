import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            int p = n;
            while(j<=n){
                if(p<i){
                    System.out.print(p);
                    p -= 1;
                }
                if(p==i){
                    System.out.print('*');
                    p -= 1;
                }
                if(p>i){
                    System.out.print(p);
                    p -= 1;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
