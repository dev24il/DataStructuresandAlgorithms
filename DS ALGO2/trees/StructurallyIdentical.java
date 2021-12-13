package trees;
import java.util.LinkedList;
import java.util.Queue;

public class StructurallyIdentical {
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if((root1 == null && root2!=null) || (root1!=null && root2==null)){
            return false;
        }
        Queue<TreeNode<Integer>> q1 = new LinkedList<>();
        Queue<TreeNode<Integer>> q2 = new LinkedList<>();
        q1.add(root1);
        q2.add(root2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode<Integer> ans1 = q1.poll();
            TreeNode<Integer> ans2 = q2.poll();
            if(ans1.data != ans2.data){
                return false;
            }
            for(int i = 0; i < ans1.children.size(); i++){
                try {
                    if(ans1.children.get(i).data != ans2.children.get(i).data){
                        return false;
                    }
                } catch (Exception e) {
                    //TODO: handle exception
                    return false;
                }
                q1.add(ans1.children.get(i));
                q2.add(ans2.children.get(i));
            }
        }
        if(q1.isEmpty()==true && q2.isEmpty()==true){
            return true;
        }
        return false;
	}
}
