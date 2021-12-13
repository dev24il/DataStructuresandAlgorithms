package BinaryTree;
import java.util.Scanner;

public class ReplaceNodeWithDepth {
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

    public static void Depth(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }
        root.data = k;
        Depth(root.left, k+1);
        Depth(root.right, k+1);
    }
    
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        Depth(root, 0);
	}

    
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root==null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        boolean leftAns = isNodePresent(root.left, x);
        boolean rightAns = isNodePresent(root.right, x);
        if(leftAns == true || rightAns == true){
            return true;
        }
        return false;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        changeToDepthTree(root);
        s.close();
    }
}
