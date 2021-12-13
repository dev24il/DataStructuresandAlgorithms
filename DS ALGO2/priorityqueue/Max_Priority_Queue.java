package priorityqueue;

import java.util.ArrayList;

public class Max_Priority_Queue<T> {
    
    private ArrayList<Element<T>> heap;
    public Max_Priority_Queue(){
        heap = new ArrayList<>();
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size() == 0;
    }

    public T getMax(){
        if(isEmpty()){
            return null;
        }
        return heap.get(0).value;
    }

    public void insert(T element, int priority){
        Element<T> e = new Element<T>(element, priority);
        heap.add(e);

        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while(parentIndex >= 0){
        if(heap.get(parentIndex).priority < heap.get(childIndex).priority){
            Element<T> temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(childIndex));
            heap.set(childIndex, temp);
            childIndex = parentIndex;
            parentIndex = (childIndex-1)/2;
        }else{
            return;
        }
        }
    }

    public T removeMax(){
        if(heap.isEmpty()){
            return null;
        }
        T ans = heap.get(0).value;
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        while(leftChildIndex < heap.size()){
        int maxIndex = parentIndex;
        if(heap.get(maxIndex).priority < heap.get(leftChildIndex).priority){
            maxIndex = leftChildIndex;
        }

        if(rightChildIndex < heap.size() && heap.get(maxIndex).priority < heap.get(rightChildIndex).priority){
            maxIndex = rightChildIndex;
        }
        if(maxIndex == parentIndex){
            break;
        }

        Element<T> temp = heap.get(maxIndex);
        heap.set(maxIndex, heap.get(parentIndex));
        heap.set(parentIndex, temp);
        parentIndex = maxIndex;
        leftChildIndex = parentIndex*2+1;
        rightChildIndex = parentIndex*2+2;
        }
        return ans;
    }
}
