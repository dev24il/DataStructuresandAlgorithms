package priorityqueue;
import java.util.PriorityQueue;

public class KLargestElement {
    public static void main(String[] args) {
        int[] arr = {4,3,7,6,9,10,1,2};
        int k = 3;
        printKLargest(arr, k);
    }

    private static void printKLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
