package BinaryTree;
import java.util.Scanner;

public class NodeWithoutSibling {
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

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        if((root.left == null && root.right != null) || (root.left != null && root.right == null)){
            System.out.print(root.data + " ");
        }else if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        printNodesWithoutSibling(root);
        s.close();
    }
}
