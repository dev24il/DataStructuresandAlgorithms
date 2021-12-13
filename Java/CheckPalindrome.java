import java.util.Scanner;

public class CheckPalindrome {

    public static boolean isPalindrome(String str){
        int n = str.length();
        boolean is = false;
        int ct=0;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                ct += 1;
            }
        }
        if(ct==n/2){
            is = true;
        }
        return is;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
