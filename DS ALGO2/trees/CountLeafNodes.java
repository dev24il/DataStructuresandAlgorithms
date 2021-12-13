package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountLeafNodes {
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.children.size() == 0){
            return 1;
        }

        for(int i=0;i<root.children.size();i++){
            count += countLeafNodes(root.children.get(i));
        }
        return count;
	}

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
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelwise();
        System.out.println(countLeafNodes(root));
    }
}

