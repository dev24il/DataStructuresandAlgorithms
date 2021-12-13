package linkedlist;
import java.util.Scanner;

public class EvenAfterOdd {

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

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> ptr1 = head;
        Node<Integer> dummyNode = new Node<Integer>(-1);
        Node<Integer> nummyNode = new Node<Integer>(-1);
        Node<Integer> ptr2 = dummyNode, ptr3 = nummyNode;

        while(ptr1 != null){
            if(ptr1.data % 2 != 0){
                ptr2.next = ptr1;
                ptr2 = ptr2.next;
            }else{
                ptr3.next = ptr1;
                ptr3 = ptr3.next;
            }
            ptr1 = ptr1.next;
        }
        ptr2.next = nummyNode.next;
        ptr3.next = null;
        return dummyNode.next;
	}

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = evenAfterOdd(head);
        print(head);
    }
}
