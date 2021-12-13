package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumReplacement {
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

    public static void sumReplacement(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        sumReplacement(root.left);
        sumReplacement(root.right);

        if(root.left != null){
            root.data = root.data + root.left.data;
        }
        if(root.right != null){
            root.data = root.data + root.right.data;
        }
    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
	}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        sumReplacement(root);
        preOrder(root);
    }
}
