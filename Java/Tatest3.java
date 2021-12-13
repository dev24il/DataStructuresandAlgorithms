import java.util.Scanner;

public class Tatest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        double sum = 0.000000, update = 0.000000;
        for(int i=0;i<k;i++){
            update = update + arr[i];
        }

        for(int i=0;i<n;i+=k){
            int j=i,ct=0;
            while(ct!=k){
                sum += arr[j];
                j++;
                ct++;
            }
            if(sum > update){
                update = sum;
            }
            sum=0;
        }
        double ans = update/k;
        System.out.print(ans);
    }
}