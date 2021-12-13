package BinaryTree;
import java.util.Scanner;

public class PrintNodesAtDepthK {
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

    public static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null || k < 0){
            return;
        }
        if(k==0){
            System.out.print(root.data + " ");
        }
        printNodesAtDepthK(root.left, k-1);
        printNodesAtDepthK(root.right, k-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        printNodesAtDepthK(root, 1);
        s.close();
    }
}
