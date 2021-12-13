import java.util.Scanner;

public class CodeChef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int n = s.nextInt();
            int[] arr = new int[n];
            int odd = 0, even = 0;
            for(int j=0;j<n;j++){
                arr[j] = s.nextInt();
                if(arr[j]%2==0){
                    even += 1;
                }else{
                    odd += 1;
                }
            }
            System.out.println(Math.min(even, (n+1)/2)+Math.min(odd,n/2));
        }
    }
}
