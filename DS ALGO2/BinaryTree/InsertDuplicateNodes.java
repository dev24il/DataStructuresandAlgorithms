package BinaryTree;
import java.util.Scanner;

public class InsertDuplicateNodes {
    public static BinaryTreeNode<Integer> takeTreeInput(Scanner s){
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChilld = takeTreeInput(s);
        BinaryTreeNode<Integer> rightChild = takeTreeInput(s);
        root.left = leftChilld;
        root.right = rightChild;
        return root;
    }

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        BinaryTreeNode<Integer> oldleft;
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        oldleft = root.left;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
        root.left = newNode;
        root.left.left = oldleft;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        insertDuplicateNode(root);
    }
}
