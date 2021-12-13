package linkedlist;

import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> createLinkedList(){

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void printIthNode(Node<Integer> head, int i){
        Node<Integer> temp = head;
        int ct = 0;
        if(temp == null){
            return;
        }

        while(temp != null){
            if(ct == i){
                System.out.println(temp.data);
                break;
            }
            ct++;
            temp = temp.next;
        }
    }

    public static Node<Integer> increment(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
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

    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
        Node<Integer> temp = head;
        Node<Integer> ptr;

        while(temp != null && temp.next != null){
            ptr = temp.next;
            temp.next = ptr.next;
            temp = temp.next;
        }
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while(temp != null){

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> takeInput(){

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;

        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                // Make this node as head node and tail node
                head = currentNode;
                tail = currentNode;
            }else{
                // Node<Integer> tail = head;
                // while(tail.next != null){

                //     tail = tail.next;
                // }
                // // Now tail will refer to last node
                // // Connect current node after last node
                // tail.next = currentNode;

                tail.next = currentNode;
                tail = currentNode;  // tail = tail.next
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }
    public static void main(String[] args) {

        // Node<Integer> head = createLinkedList();
        Node<Integer> head = takeInput();
        // head = increment(head);
        deleteAlternateNodes(head);
        print(head);
        // System.out.println(length(head));
        // printIthNode(head, 4);

        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
