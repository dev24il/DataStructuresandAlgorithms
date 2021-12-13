package BinaryTree;

public class ConstructBST {
    public static BinaryTreeNode<Integer> construct(int[] arr, int st, int end){
        if(arr.length == 0){
            return null;
        }
        if(st > end){
            return null;
        }

        int middleIndex = (st+end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[middleIndex]);
        if(st == end){
            return root;
        }
        root.left = construct(arr, st, middleIndex-1);
        root.right = construct(arr, middleIndex+1, end);
        return root;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        if(arr.length == 0){
            return null;
        }
        return construct(arr, 0, n-1);
	}

    public static void preOrder(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
	}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        BinaryTreeNode<Integer> root = SortedArrayToBST(arr, 7);
        preOrder(root);
    }
}

