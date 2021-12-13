package linkedlist;
import java.util.Scanner;

public class MidPoint {
    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = s.nextInt();

        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }

        s.close();
        return head;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = midPoint(head);
        System.out.print(head.data);
    } 
}
