package linkedlist;
import java.util.Scanner;

public class MergeSort {
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

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1,Node<Integer> head2) {
        if(head1 == null && head2 == null){
            return null;
        }
        if(head1 == null){
            return head2;
        }else if(head2 == null){
            return head1;
        }
        
        Node<Integer> ptr1 = head1, ptr2 = head2;
        Node<Integer> dummyNode = new Node<>(-1);
        Node<Integer> ptr3 = dummyNode;

        while(ptr1 != null && ptr2 != null){
            if(ptr1.data < ptr2.data){
                ptr3.next = ptr1;
                ptr1 = ptr1.next;
            }else{
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
            }
            ptr3 = ptr3.next;
        }

        while(ptr1 != null){
            ptr3.next = ptr1;
            ptr1 = ptr1.next;
            ptr3 = ptr3.next;
        }

        while(ptr2 != null){
            ptr3.next = ptr2;
            ptr2 = ptr2.next;
            ptr3 = ptr3.next;
        }

        return dummyNode.next;
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

    public static Node<Integer> mergeSort(Node<Integer> head) {
		//Your code goes here
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        Node<Integer> temp = head, prev = null, ptr1 = null;
        int len = length(head);
        int mid = len/2, ct = 0;

        ptr1 = temp;
        while(ct != mid){
            ct++;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;

        ptr1 = mergeSort(ptr1);
        temp = mergeSort(temp);
        head = mergeTwoSortedLinkedLists(ptr1, temp);

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
        head = mergeSort(head);
        print(head);
    }
}
