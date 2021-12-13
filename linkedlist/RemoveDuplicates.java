package linkedlist;
import java.util.Scanner;

public class RemoveDuplicates {
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

    public static Node<Integer> removeDuplicates(Node<Integer> head){
        Node<Integer> temp = head, prev = head;
        if(head == null){
            return null;
        }
        while(temp.next != null){
            if(prev.data == temp.next.data){
                prev.next = temp.next.next;
            }else{
                prev = prev.next;
                temp = temp.next;
            }
        }
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
        head = removeDuplicates(head);
        print(head);
    }
}
