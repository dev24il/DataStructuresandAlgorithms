package BinaryTree;
import java.util.Scanner;

public class GetLCA {
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

    public static int getLCA(BinaryTreeNode<Integer> root, int k1, int k2){
        if(root == null){
            return -1;
        }
        if(root.data > k1 && root.data < k2){
            return root.data;
        }else if(root.data > k1){
            return getLCA(root.left, k1, k2);
        }else{
            return getLCA(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeTreeInput(s);
        System.out.println(getLCA(root, 2, 10));
    }
}
