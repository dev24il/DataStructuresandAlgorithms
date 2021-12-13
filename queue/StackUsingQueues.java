package queue;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueues() {
        //Implement the Constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.size() == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
    }

    public int pop() {
        //Implement the pop() function
        if(q1.size() == 0){
            return -1;
        }
        while(q1.size() > 1){
            q2.add(q1.poll());
        }
        int temp = q1.poll();
        while(q2.size() != 0){
            q1.add(q2.poll());
        }
        return temp;
    }

    public int top() {
        //Implement the top() function
        if(getSize() == 0){
            return -1;
        }
        int temp = 0;
        while(q1.size() >= 1){
            temp = q1.poll();
            q2.add(temp);
        }
        while(q2.size() != 0){
            q1.add(q2.poll());
        }
        return temp;
    }
}
