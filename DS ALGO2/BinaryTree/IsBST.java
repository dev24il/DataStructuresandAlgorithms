package BinaryTree;
import java.util.Scanner;

public class IsBST {
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

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftMax = maximum(root.left);
        if(leftMax >= root.data){
            return false;
        }

        int rightMin = minimum(root.right);
        if(rightMin < root.data){
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        return isLeftBST && isRightBST;
    }
    private static int maximum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        return Math.min(root.data, Math.min(leftMax, rightMax));
    }

    private static int minimum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static boolean isBST3(BinaryTreeNode<Integer> root , int minRange, int maxRange){
        if(root == null){
            return true;
        }
        if(root.data < minRange || root.data > maxRange){
            return false;
        }

        boolean left = isBST3(root.left,minRange, root.data-1);
        boolean right = isBST3(root.right,root.data, maxRange);
        return left && right;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        System.out.println(isBST(root));
    }
}
