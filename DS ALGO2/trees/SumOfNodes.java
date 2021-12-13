package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfNodes {
    public static TreeNode<Integer> takeInputLevelwise() {
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

    public static int sumNodes(TreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int sum = root.data;
        for(int i=0;i<root.children.size();i++){
            sum += sumNodes(root.children.get(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelwise();
        System.out.println(sumNodes(root));
    }
}

