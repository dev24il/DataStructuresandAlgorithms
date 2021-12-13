package BinaryTree;

public class BST {
    
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x){
        if(node == null){
            return false;
        }

        if(node.data == x){
            return true;
        }

        if(x < node.data){
            return isPresentHelper(node.left, x);
        }else{
            return isPresentHelper(node.right, x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root, x);
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
        if(node == null){
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
            return newRoot;
        }

        if(x >= node.data){
            node.right = insertHelper(node.right, x);
        }else{
            node.left = insertHelper(node.left, x);
        }
        return node;
    }

    public void insert(int x){
        root = insertHelper(root, x);
        size++;
    }

    private static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.min(root.data, Math.min(largestLeft, largestRight));
    }

    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return new BSTDeleteReturn(null, false);
        }

        if(root.data < x){
            BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }

        if(root.data > x){
            BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        if(root.left == null && root.right == null){
            return new BSTDeleteReturn(null, true);
        }

        if(root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left, true);
        }

        if(root.left == null && root.right != null){
            return new BSTDeleteReturn(root.right, true);
        }

        int rightMax = largest(root.right);
        root.data = rightMax;
        BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMax);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);
    }

    public boolean deleteData(int x){
        BSTDeleteReturn output = deleteDataHelper(root, x);
        root = output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }

    public int size(){
        return size;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node == null){
            return;
        }
        String s = node.data + ":";
        if(node.left != null){
            s = s + "L:" + node.left.data + ",";
        }
        if(node.right != null){
            s = s + "R:" + node.right.data;
        }
        System.out.println(s);
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    public void printTree(){
        printTreeHelper(root);
    }
}
