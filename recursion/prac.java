package recursion;

import java.util.Scanner;

public class prac {
    public static boolean checkAB(String input) {
		// Write your code here
        int n = input.length();
        int ct = 0;
        for(int i=0;i<n-2;i++){
            if(input.charAt(i)=='a' && (input.charAt(i+1)=='a' || (input.charAt(i+1)=='b' && input.charAt(i+2)=='b') || input.charAt(i+1)==' ')){
                ct += 1;
            }
            else if((input.charAt(i)=='b' && input.charAt(i+1)=='b') && (input.charAt(i+2)=='a' || input.charAt(i+2)==' ')){
                ct += 1;
            }
        }
        if(ct==n-2){
            return true;
        }
        return false;
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkAB(str));
        sc.close();
    }
}
