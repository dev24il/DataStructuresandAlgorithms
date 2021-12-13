package recursion;

import java.util.Scanner;

public class SumOfNNaturalNum {

    public static int sumn(int n){
        if(n==0){
            return 0;
        }
        int smallOutput = sumn(n-1);
        int output = n + smallOutput;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(sumn(num));
        sc.close();
    }
}
