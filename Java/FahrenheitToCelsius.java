import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void table(int s,int e,int w){
        for(int i=s;i<=e;i+=w){
            int ans = (i-32)*5/9;
            System.out.println(i + "\t" + ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        table(s, e, w);
    }
}
