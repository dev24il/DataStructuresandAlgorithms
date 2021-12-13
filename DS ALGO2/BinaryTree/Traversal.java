package BinaryTree;
import java.util.Scanner;

public class Traversal {
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

    
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
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
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        postOrder(root);
        s.close();
    }
    
}
