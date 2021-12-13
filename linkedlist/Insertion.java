package linkedlist;

import java.util.Scanner;

public class Insertion {

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

    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        Node<Integer> temp = head;
        int ct = 0;

        if(pos==0){
            Node<Integer> newNode = new Node<Integer>(data);
            newNode.next = head;
            head = newNode;
        }
        if(head == null){
            return null;
        }
        while(temp.next != null){
            ct++;
            if(ct == pos){
                Node<Integer> newNode = new Node<Integer>(data);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        if(pos == ct+1){
            Node<Integer> newNode = new Node<Integer>(data);
            temp.next = newNode;
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
        head = insert(head, 5, 44);
        print(head);
    }
}
