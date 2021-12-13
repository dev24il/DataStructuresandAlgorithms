package linkedlist;
import java.util.Scanner;

public class FindNode {

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

    public static int findNode(Node<Integer> head, int n) {
        Node<Integer> temp = head;
        int ct = 0;
        while(temp != null){
            if(temp.data == n){
                return ct;
            }
            ct++;
            temp = temp.next;
        }
        return -1;
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
        print(head);
        System.out.println(findNode(head, 19));
    }
}
