package linkedlist;
import java.util.Scanner;

public class PrintRecursive {

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

    public static void printRecursive(Node<Integer> head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printRecursive(head.next);;
    }

    public static Node<Integer> printR(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> smallHead = printR(head.next);
        Node<Integer> temp = smallHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;

        return smallHead;
    }

    public static Node<Integer> insertRecursively(Node<Integer> head, int pos, int data){
        if(head == null && pos>0){
            return head;
        }
        if(pos == 0){
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> ptr = insertRecursively(head.next, pos-1, data);
        head.next = ptr;
        return head;
    }

    public static Node<Integer> deleteRecursively(Node<Integer> head, int pos){
        if(head == null && pos >= 0){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        head.next = deleteRecursively(head.next, pos-1);
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

    public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
        if(head == null){
            return -1;
        }
        if(head.data == n){
            return 1;
        }
        int ct = findNodeRec(head.next, n);
        return ct - 1;
	}

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        // head = deleteRecursively(head, 0);
        // printRecursive(head);
        // head = printR(head);
        System.out.println(findNodeRec(head, 2));
        // print(head);
    }
}
