import java.util.Scanner;

public class Starter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            int d1 = a+b;
            int d2 = p+q;
            if((d1%2==0 && d2%2!=0) || (d1%2!=0 && d2%2==0)){
                System.out.println("1");
            }else if((a==b) && (b==p) && (p==q)){
                System.out.println("0");
            }else if((d1%2==0 && d2%2==0) || (d1%2!=0 && d2%2!=0)){
                System.out.println("2");
            }
        }
        sc.close();
    }
}
