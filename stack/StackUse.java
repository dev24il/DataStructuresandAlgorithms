package stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        
        // StackUsingArray stack = new StackUsingArray();
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        int arr[] = {5,6,7,1,9};

        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }

        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }

        // stack.push(10);
        // System.out.println(stack.top());
        // System.out.println(stack.size());
        // System.out.println(stack.pop());
        // System.out.println(stack.isEmpty());
    }
}
