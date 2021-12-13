package BinaryTree;
import java.util.Scanner;

public class DiameterOfBinaryTree {
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

    public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int a = Math.max(leftHeight, rightHeight);
        return 1 + a;
	}

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int ans = leftHeight + rightHeight;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int max = Math.max(leftDiameter, rightDiameter);
        return 1 + Math.max(ans, max);
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        System.out.println(diameterOfBinaryTree(root));
        s.close();
    }
}
