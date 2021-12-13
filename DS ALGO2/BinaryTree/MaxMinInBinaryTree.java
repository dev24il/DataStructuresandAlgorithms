package BinaryTree;
import java.util.Scanner;

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class MaxMinInBinaryTree {
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

    public static int maxValue(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);
        return Math.max(root.data,Math.max(leftMax, rightMax));
    }

    public static int minValue(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftMax = minValue(root.left);
        int rightMax = minValue(root.right);
        return Math.min(root.data,Math.min(leftMax, rightMax));
    }

    // public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
	// 	//Your code goes here
    //     Pair<Integer, Integer> p = new Pair(minValue(root),maxValue(root));
    //     return p;
    // }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // BinaryTreeNode<Integer> root = takeTreeInput(s);
        // Pair<Integer,Integer> p = getMinAndMax(root);
        // System.out.println(p.minimum + p.maximum);
        s.close();
    }
}
