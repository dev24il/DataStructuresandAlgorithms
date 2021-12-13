package BinaryTree;
import java.util.Scanner;

public class RemoveLeafNodes {
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

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        String s = root.data + ":";
        if(root.left != null){
            s = s + "L" + root.left.data + ",";
        }
        if(root.right != null){
            s = s + "R" + root.right.data + ",";
        }
        System.out.println(s);
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        root = removeLeaves(root);
        printTreeDetailed(root);
        s.close();
    }
}
