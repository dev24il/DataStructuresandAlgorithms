package stack;
import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {

    public static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        boolean ans = false;
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i)=='(' || expression.charAt(i)=='+'){
                stack.push(expression.charAt(i));
            }else if(expression.charAt(i)==')'){
                if(stack.firstElement()=='('){
                    ans = true;
                }
                while(stack.firstElement()=='+'){
                    stack.pop();
                }
                stack.pop();
            }
        }
        return ans;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(checkRedundantBrackets(input));
        sc.close();
    }
}
