package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueCollections {

    public static void reverseQueue(Queue<Integer> input) {

        Stack<Integer> st = new Stack<>();
        while(input.size() != 0){
            st.push(input.poll());
        }

        while(st.size() != 0){
            input.add(st.pop());
        }
	}

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        int ct = 0;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> ptr = input;
        while(ct != k){
            st.push(ptr.poll());
            ct++;
        }

        Queue<Integer> extra = new LinkedList<>();
        while(ptr.size() != 0){
            extra.add(ptr.poll());
        }
        while(st.size() != 0){
            ptr.add(st.pop());
        }
        while(extra.size() != 0){
            ptr.add(extra.poll());
        }
        return input;
	}

    
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        // reverseQueue(q);
        q = reverseKElements(q, 3);
        while(q.size() != 0){
            System.out.println(q.poll());
        }
        // System.out.println(queue.size());
        // System.out.println(queue.peek());
        // System.out.println(queue.poll());
        // System.out.println(queue.size());

    }
}
