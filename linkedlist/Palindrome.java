package linkedlist;
import java.util.Scanner;

public class Palindrome {

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

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> currentNode = head;
        Node<Integer> prevNode = null;
        Node<Integer> nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }

    public static boolean isPalindrome(Node<Integer> head) {

        if(head == null || head.next == null){
            return true;
        }
        int len = length(head);
        int mid = len/2, ct = 0;

        Node<Integer> temp = head,prev = temp;
        while(ct != mid-1){
            ct++;
            temp = temp.next;
        }
        Node<Integer> curr = temp.next;
        temp.next = null;

        curr = reverse(curr);
        while(curr!=null && prev!=null){
            if(curr.data != prev.data){
                return false;
            }
            curr = curr.next;
            prev = prev.next;
        }
        return true;
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
        // head = isPalindrome(head);
        // head = reverse(head);
        System.out.println(isPalindrome(head));
    }
}
