package stack;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static boolean balancedParenthesis(String expression){

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i)=='('){
                stack.push('(');
            }else if(expression.charAt(i)==')' && stack.isEmpty()==true){
                return false;
            }else{
                stack.pop();
            }
        }
        if(stack.isEmpty()==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balancedParenthesis(str));
        sc.close();
    }
}
