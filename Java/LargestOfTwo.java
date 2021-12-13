import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args){

        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            System.out.println("First number is greater.");
        }else{
            System.out.println("Second number is greater.");
        }

        System.out.println("Outside if else");
    }
}
