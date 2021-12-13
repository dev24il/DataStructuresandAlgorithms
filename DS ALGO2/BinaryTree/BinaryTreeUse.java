package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
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
    
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> ans = q.poll();
            // System.out.println(ans.data+":"+"L:"+ans.left.data+"R:"+ans.right.data);
            String s = ans.data + ":" + "L:";
            if(ans.left == null){
                s += "-1" + ",";
            }else{
                s += ans.left.data + ",";
            }

            if(ans.right == null){
                s += "R:-1";
            }else{
                s += "R:" + ans.right.data;
            }
            System.out.println(s);
            if(ans.left != null){
                q.add(ans.left);
            }
            if(ans.right != null){
                q.add(ans.right);
            }
        }
	}

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            s.close();
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChilld = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChilld;
        root.right = rightChild;
        s.close();
        return root;
    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
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
            s = s + "R" + root.right.data;
        }
        System.out.println(s);
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1 + leftNodeCount + rightNodeCount;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        // printTreeDetailed(root);
        // System.out.println(numNodes(root));
        // System.out.println(largest(root));
        printLevelWise(root);

        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
        // BinaryTreeNode<Integer> node3 = new BinaryTreeNode<Integer>(4);
        // BinaryTreeNode<Integer> node4 = new BinaryTreeNode<Integer>(5);

        // root.left = node1;
        // root.right = node2;
        // node1.left = null;
        // node1.right = node3;
        // node2.right = null;
        // node2.left = node4;
        // printTreeDetailed(root);
    }
}
