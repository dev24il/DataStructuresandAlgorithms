package trees;

public class ReplaceNodeWithDepth {
    public static void depth(TreeNode<Integer> root , int k){
        if(root == null){
            return;
        }
        root.data = k;
        for(int i = 0; i < root.children.size(); i++){
            depth(root.children.get(i), k+1);
        }
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root){
        depth(root, 0);
	}
}
