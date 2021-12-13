package BinaryTree;
import java.util.Scanner;

public class SumOfNodes {
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

    
	public static int getSum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        return root.data + leftSum + rightSum;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        System.out.println(getSum(root));
        s.close();
    }
}
