package BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElementInRange {
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        if(rootData == -1){
            s.close();
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);
        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = s.nextInt();
            if(left != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter right child of " + front.data);
            int right = s.nextInt();
            if(right != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        s.close();
        return root;
    }

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root == null){
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        if(root.data < k1){
            elementsInRangeK1K2(root.right, k1, k2);
        }else if(root.data > k2){
            elementsInRangeK1K2(root.left, k1, k2);
        }else{
            arr.add(root.data);
            elementsInRangeK1K2(root.left, k1, k2);
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        elementsInRangeK1K2(root, 6, 10);
    }
}
