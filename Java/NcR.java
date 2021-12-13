import java.util.Scanner;

/*Readibility
Testabiltity
Repititive
*/

public class NcR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factN = 1;
        for(int i=1;i<=n;i++){
            factN *= i;
        }

        int factR = 1;
        for(int i=1;i<=r;i++){
            factR *= i;
        }

        int factNR = 1;
        for(int i=1;i<=n-r;i++){
            factNR *= i;
        }
        int result = factN/(factR*factNR);
        System.out.println(result);
    }
}
