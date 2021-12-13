package linkedlist;
import java.util.Scanner;

public class BubbleSort {
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

    public static int length(Node<Integer> head){
        Node<Integer> temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static Node<Integer> bubbleSort(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        int len = length(head);

        Node<Integer> temp;
        for(int i = 0; i < len - 1; i++){
            temp = head;
            for(int j = 0; j < len - i - 1; j++){
                if(temp.data > temp.next.data){
                    int store = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = store;
                }
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
        head = bubbleSort(head);
        print(head);
    }
}
