import java.util.HashMap;
import java.util.Scanner;

public class Starter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt();
                if(map.containsKey(arr[j])){
                    int ans = map.get(arr[j]);
                    map.put(arr[j], ans+1);
                }else{
                    map.put(arr[j], 1);
                }
            }
            if(n < 12 || map.size() >= 13){
                System.out.println("no");
            }else if(n >= 12 && map.size() <= 12){
                System.out.println("yes");
            }
        }
        sc.close();
    }
}
