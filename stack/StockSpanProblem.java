package stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {

    public static int[] stockSpan(int[] price){

        int[] brr = new int[price.length];
        int days = 0;
        for(int i = 0; i < price.length; i++){
            for(int j = i; j >= 0; j--){
                if(price[i] >= price[j]){
                    days++;
                }else{
                    break;
                }
            }
            brr[i] = days;
            days = 0;
        }
        return brr;
    }

    public static int[] stockspan(int[] price){
        int n = price.length;
        int[] arr = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        arr[0] = 1;
        for(int i = 1; i < n; i++){
            while(stack.size() > 0 && price[i] > price[stack.peek()] ){
                stack.pop();
            }
            if(stack.size() == 0){
                arr[i] = i + 1;
            }else{
                arr[i] = i - stack.peek();
            }
            stack.push(i);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {60,70,80,100,90,75,80,120};
        int[] brr = stockspan(arr);
        for(int i : brr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
