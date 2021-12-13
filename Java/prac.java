import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            long n = sc.nextLong();
            long p = sc.nextLong();
            long k = sc.nextLong();
            long rem  = p%k;
            long few = (n-1)%k;
            if(few<rem){
                long su = few*2;
                long last = rem - few;
                long ans = su + last;
                System.out.println(ans+2);
            }else{
                long su = rem*2;
                if(p>=k){
                    System.out.println(su+2);
                }else{
                    System.out.println(su+1);
                }
            }
        }
    }
}