package linkedlist;
import java.util.Scanner;

public class Deletion {

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

    public static Node<Integer> deleteLastNode(Node<Integer> head){
        Node<Integer> temp = head, prev = null;

        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

    public static Node<Integer> delete(Node<Integer> head, int pos){
        Node<Integer> temp = head;
        int ct = 0;

        if(head == null){
            return null;
        }
        if(pos == 0){
            head = temp.next;
            return head;
        }
        while(temp.next != null){
            ct++;
            if(ct == pos){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        if(ct == pos){
            head = deleteLastNode(head);
            return head;
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
        head = delete(head, 3);
        // head = deleteLastNode(head);
        print(head);
    }
}
