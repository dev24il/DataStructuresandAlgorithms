package linkedlist;

public class Merge {

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

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head1 = new Node<Integer>(1);
        Node<Integer> n1 = new Node<Integer>(3);
        Node<Integer> n2 = new Node<Integer>(5);
        head1.next = n1;
        n1.next = n2;
        n2.next = null;

        Node<Integer> head2 = new Node<Integer>(2);
        Node<Integer> h1 = new Node<Integer>(4);
        Node<Integer> h2 = new Node<Integer>(6);
        Node<Integer> h3 = new Node<Integer>(12);
        Node<Integer> h4 = new Node<Integer>(15);
        head2.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = null;

        head1 = mergeTwoSortedLinkedLists(head1, head2);
        print(head1);
    }
}
