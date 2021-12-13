import java.util.Scanner;

public class Starter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if((x+y)> z){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}

/*
-1
1 3 2
3 2 1 4
*/

