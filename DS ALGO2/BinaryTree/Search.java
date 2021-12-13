package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Search {
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        if(rootData == -1){
            s.close();
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);
        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = s.nextInt();
            if(left != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter right child of " + front.data);
            int right = s.nextInt();
            if(right != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        s.close();
        return root;
    }

    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null){
            return false;
        }
        if(root.data == k){
            return true;
        }else if(root.data > k){
            return searchInBST(root.left, k);
        }else{
            return searchInBST(root.right, k);
        }
	}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(searchInBST(root, 2));
    }
}
