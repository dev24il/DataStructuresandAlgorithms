package linkedlist;
import java.util.Scanner;

public class SwapNode {
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

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> temp = head, pemp = head;
        int ct = 0, pt = 0;
        while(ct < i){
            temp = temp.next;
            ct++;
        }
        while(pt < j){
            pemp = pemp.next;
            pt++;
        }
        int store = temp.data;
        temp.data = pemp.data;
        pemp.data = store;

        return head;
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
        head = swapNodes(head, 0, 6);
        print(head);
    }
}
