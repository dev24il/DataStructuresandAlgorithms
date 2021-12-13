package linkedlist;
import java.util.Scanner;

public class DeleteNNodes {

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

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if(head == null || (head.next == null && N == 0)){
            return head;
        }else if(head.next == null && N == 1 && M == 0){
            return null;
        }

        Node<Integer> smallHead = skipMdeleteN(head, M, N);
        head.next = smallHead;
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
        head = skipMdeleteN(head, 2, 3);
        print(head);
    }
}
