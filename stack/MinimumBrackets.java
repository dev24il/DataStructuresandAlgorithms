package stack;
import java.util.Scanner;
import java.util.Stack;

public class MinimumBrackets {
    
    public static int countBracketReversals(String input) {

        if(input.length()%2 != 0){
            return -1;
        }
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i)=='{'){
                stack.push(input.charAt(i));
            }else if(input.charAt(i)=='}' && stack.size()!=0 && stack.peek()=='{'){
                stack.pop();
            }else{
                stack.push(input.charAt(i));
            }
        }

        int ct = 0;
        while(stack.size() != 0){
            char c1 = stack.pop();
            char c2 = stack.pop();
            if(c1 == c2){
                ct++;
            }else if(c1 == '{' && c2 == '}'){
                ct += 2;
            }
        }
        return ct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(countBracketReversals(input));
        sc.close();
    }
}
