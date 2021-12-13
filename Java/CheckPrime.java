import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 2;
        while(div <= 2){
            if(n%div==0){
                System.out.println("Number is not prime.");
                return;                 // exit from main
            }
            div += 1;
        }
        System.out.println("Number is prime.");
    }
}
