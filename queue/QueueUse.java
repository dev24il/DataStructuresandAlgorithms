package queue;

public class QueueUse {
    public static void main(String[] args) {

        // QueueUsingArray queue = new QueueUsingArray(3);
        // int arr[] = {10,20,30,40,50};

        // for(int elem : arr){
        //     queue.enqueue(elem);
        // }

        // while( ! queue.isEmpty()){
        //     try {
        //         System.out.println(queue.dequeue());
        //     } catch (QueueEmptyException e) {
        //         // will never reach here
        //     }
        // }


        QueueUsingStacks<Integer> q = new QueueUsingStacks<>();
        int[] arr = {1,2,3,4,5};

        for(int i : arr){
            q.enqueue(i);
        }
        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.front());
    }
}
