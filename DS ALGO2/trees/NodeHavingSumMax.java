package trees;

import java.util.LinkedList;
import java.util.Queue;

public class NodeHavingSumMax {
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        if(root.children.size()==0){
            return root;
        }
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        TreeNode<Integer> res = root;
        int count = 0;
        while(!q.isEmpty()){
            TreeNode<Integer> ans = q.poll();
            int sum = ans.data;
            for(int i = 0; i < ans.children.size(); i++){
                sum += ans.children.get(i).data;
                q.add(ans.children.get(i));
            }
            if(sum > count){
                count = sum;
                res = ans;
            }
            sum = 0;
        }
        return res;
	}
}
