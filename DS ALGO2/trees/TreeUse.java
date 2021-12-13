package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
    public static TreeNode<Integer> takeInput(Scanner s) {
        int n;
        System.out.println("Enter next node data: ");
        n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = s.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        System.out.print(root.data + ":");
        for(int i=0;i<root.children.size();i++){
            System.out.print(root.children.get(i).data + ",");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelwise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.print("Enter number of children of " + frontNode.data + ": ");
            int numChildren = s.nextInt();
            for(int i=0;i<numChildren;i++){
                System.out.println("Enter " + (i+1) + "th child of " + frontNode.data + ": ");
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        s.close();
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        System.out.print(root.data + " ");
        while(!q.isEmpty()){
            TreeNode<Integer> ans = q.poll();
            for(int i=0;i<ans.children.size();i++){
                System.out.print(ans.children.get(i).data + " ");
                q.add(ans.children.get(i));
            }
        }
    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInputLevelwise();
        printLevelWise(root);

        // TreeNode<Integer> root = new TreeNode<Integer>(4);
        // TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        // TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        // TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        // TreeNode<Integer> node4 = new TreeNode<Integer>(6);

        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        // System.out.println(root);
        
    }
}