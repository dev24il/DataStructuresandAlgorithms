package recursion;

import java.util.Scanner;

public class PrintNNaturalNum {
    public static void print1ton(int num){
        if(num==0){
            return;
        }
        print1ton(num-1);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        print1ton(num);
        sc.close();
    }
}
