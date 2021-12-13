package queue;

import java.util.Stack;

public class QueueUsingStacks<T> {
    
    private Stack<T> s1;
    private Stack<T> s2;

    public QueueUsingStacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public int size(){
        return s1.size();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public void enqueue(T elem){
        s1.push(elem);
    }

    public T front(){
        if(size() == 0){
            return null;
        }
        while(s1.size() != 1){
            s2.push(s1.pop());
        }
        T temp =  s1.peek();
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
        return temp;
    }

    public T dequeue(){
        if(size() == 0){
            return null;
        }
        while(s1.size() != 1){
            s2.push(s1.pop());
        }
        T temp =  s1.pop();
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
        return temp;
    }
}
