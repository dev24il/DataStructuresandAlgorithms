package BinaryTree;
import java.util.Scanner;

public class BalancedTree {
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

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root == null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }

    public static int heightOfTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);
        return isLeftBalanced && isRightBalanced;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        System.out.println(isBalanced(root));
        // printTreeDetailed(root);
        s.close();
    }
}
