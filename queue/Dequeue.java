package queue;

public class Dequeue {

    static final int MAX = 10;
    int  arr[];
    int  front;
    int  rear;
    int  size;

    public Dequeue(int size){
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull()
    {
        return ((front == 0 && rear == size-1)||
            front == rear+1);
    }
  
    // Checks whether Deque is empty or not.
    boolean isEmpty ()
    {
        return (front == -1);
    }

    public void insertFront(int key){
        if(isFull()){
            System.out.println("-1");
        }
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
        else if (front == 0)
            front = size - 1 ;
        else // decrement front end by '1'
            front = front-1;
        arr[front] = key ;
    }

    public void insertrear(int key)
    {
        if (isFull())
        {
            System.out.println("-1");
        }
  
        // If queue is initially empty
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
  
        // rear is at last position of queue
        else if (rear == size-1)
            rear = 0;
  
        // increment rear end by '1'
        else
            rear = rear+1;
         
        // insert current element into Deque
        arr[rear] = key ;
    }

    public void deletefront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println("-1");
        }
  
        // Deque has only one element
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
            // back to initial position
            if (front == size -1)
                front = 0;
  
            else // increment front by '1' to remove current
                // front value from Deque
                front = front+1;
    }

    public void deleterear()
    {
        if (isEmpty())
        {
            System.out.println("-1");
        }
  
        // Deque has only one element
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size-1;
        else
            rear = rear-1;
    }

    int getFront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            return -1 ;
        }
        return arr[front];
    }
  
    // function return rear element of Deque
    public int getRear()
    {
        // check whether Deque is empty or not
        if(isEmpty() || rear < 0)
        {
            return -1 ;
        }
        return arr[rear];
    }
}
