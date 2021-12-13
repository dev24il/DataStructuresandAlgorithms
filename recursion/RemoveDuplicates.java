package recursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length() <= 1) { 
            return s; 
        } 
        if(s.charAt(0) == s.charAt(1)) { 
            return removeConsecutiveDuplicates(s.substring(1)); 
        } 
        else { 
            String small = removeConsecutiveDuplicates(s.substring(1)); 
            return s.charAt(0) + small; 
        }
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeConsecutiveDuplicates(s));
        sc.close();
    }
}
