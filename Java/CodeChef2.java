import java.util.Scanner;

public class CodeChef2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int n = s.nextInt(); 
            // int l = s.nextInt(); 
            int r = s.nextInt(); 
            int div = n;
            int ans = 0, res = Integer.MAX_VALUE;
            int val = 0;
            for(int j=2;j<=r;j++){
                while(div!=0){
                    int rem = div%j;
                    ans += rem;
                    div = div/j;
                }
                div = n;
                if(res > ans){
                    res = ans;
                    val = j;
                }
                if(val==1){
                    break;
                }
                ans = 0;
            }
            System.out.println(val);
        }
        s.close();
    }
}
