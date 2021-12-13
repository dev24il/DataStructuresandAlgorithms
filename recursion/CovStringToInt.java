package recursion;

import java.util.Scanner;
import java.lang.Math;

public class CovStringToInt {

    public static int convertStringToInt(String input){
		// Write your code here
        if (input.length() == 1)
            return (input.charAt(0) - '0');
        double y = convertStringToInt(input.substring(1));
        double x = input.charAt(0) - '0';
        x = x * Math.pow(10, input.length() - 1) + y;
        return (int)(x);
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(convertStringToInt(str));
        sc.close();
    }
}
