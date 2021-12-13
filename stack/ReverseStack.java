package stack;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		while(input.isEmpty() != true){
            extra.push(input.pop());
        }
        while(extra.isEmpty() != true){
            System.out.print(extra.pop() + " ");
        }
	}
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            input.push(a);
        }
        
        reverseStack(input, extra);
        sc.close();
    }
}
