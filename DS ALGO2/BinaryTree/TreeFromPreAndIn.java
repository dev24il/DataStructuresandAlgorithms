package BinaryTree;

public class TreeFromPreAndIn {
    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int idx = 0;
    public static BinaryTreeNode<Integer> treeFromPreAndIn(int[] preorder, int[] inorder, int start, int end){
        if(start > end){
            return null;
        }

        int curr = preorder[idx];
        idx++;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(curr);
        if(start == end){
            return root;
        }   
        
        int pos = search(inorder, start, end, curr);
        root.left = treeFromPreAndIn(preorder, inorder, start, pos-1);
        root.right = treeFromPreAndIn(preorder, inorder, pos+1, end);
        return root;     
    }

    private static int search(int[] inorder, int start, int end, int curr) {
        for(int i = start; i <= end; i++){
            if(inorder[i] == curr){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] preorder = {1,2,4,5,3,6,7};
        int[] inorder = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> node = treeFromPreAndIn(preorder, inorder, 0, inorder.length-1);
        inorder(node);
    }
}
