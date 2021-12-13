package BinaryTree;

public class TreeFromPostAndIn {
    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static BinaryTreeNode<Integer> treeFromPostAndIn(int[] postorder, int[] inorder, int start, int end) {
        if(start > end){
            return null;
        }
        int curr = postorder[idx];
        idx--;

        int pos = search(inorder, start, end, curr);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(curr);
        if(start == end){
            return root;
        }

        root.right = treeFromPostAndIn(postorder, inorder, pos+1, end);
        root.left = treeFromPostAndIn(postorder, inorder, start, pos-1);
        return root;
    }
    public static int idx = 6;

    public static int search(int[] inorder, int start, int end, int curr) {
        for(int i = start; i <= end; i++){
            if(inorder[i] == curr){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] postorder = {4,5,2,6,7,3,1};
        int[] inorder = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> node = treeFromPostAndIn(postorder, inorder, 0, inorder.length-1);
        inorder(node);
    }
}
