package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SecondLargestElement {
    public static int largest(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = root.data;

        for(int i=0;i<root.children.size();i++){
            int maxChild = largest(root.children.get(i));
            if(maxChild > max){
                max = maxChild;
            }
        }
        return max;
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        if(root == null){
            return null;
        }else if(root.children.size() == 0){
            return null;
        }

        int max = largest(root);
        TreeNode<Integer> secMax = root;
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<Integer> ans = q.poll();
            for(int i=0;i<ans.children.size();i++){
                if(secMax.data <= ans.children.get(i).data && max > ans.children.get(i).data){
                    secMax = ans.children.get(i);
                }else if(secMax.data == max && max > ans.children.get(i).data){
                    secMax = ans.children.get(i);
                }
                q.add(ans.children.get(i));
            }
        }
        if(secMax.data == max){
            return null;
        }
        return secMax;
    }
}
