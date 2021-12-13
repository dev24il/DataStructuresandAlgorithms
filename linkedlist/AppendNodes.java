package linkedlist;
import java.util.Scanner;

public class AppendNodes {
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

    
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

        if(head == null){
            return null;
        }else if(n==0){
            return head;
        }
        Node<Integer> temp = head;
        Node<Integer> first = null;
        Node<Integer> second = head, prev = null;
        int ans = length(head) , ct  = 0;

        while(ct != ans-n){
            ct++;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        first = temp;
        Node<Integer> curr = first;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = second;
        return first;
	}

    public static int length(Node<Integer> head){
        Node<Integer> temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
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
        head = appendLastNToFirst(head, 0);
        print(head);
    }
}
