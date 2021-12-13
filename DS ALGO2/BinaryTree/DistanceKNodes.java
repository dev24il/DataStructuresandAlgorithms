package BinaryTree;
import java.util.Scanner;

public class DistanceKNodes {
    public static BinaryTreeNode<Integer> takeTreeInput(Scanner s){
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChilld = takeTreeInput(s);
        BinaryTreeNode<Integer> rightChild = takeTreeInput(s);
        root.left = leftChilld;
        root.right = rightChild;
        return root;
    }

    //Case 1
    public static void printSubtreeNodes(BinaryTreeNode<Integer> root, int k){
        if(root == null || k < 0){
            return;
        }
        if(k == 0){
            System.out.print(root.data + " ");
        }

        printSubtreeNodes(root.left, k-1);
        printSubtreeNodes(root.right, k-1);
    }

    //case 2
    public static int printNodesAtK(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target, int k){
        if(root == null){
            return -1;
        }
        if(root == target){
            printSubtreeNodes(root, k);
            return 0;
        }

        int dl = printNodesAtK(root.left, target, k);
        if(dl != -1){
            if(dl + 1 == k){
                System.out.print(root.data + " ");
            }else{
                printSubtreeNodes(root.right, k-dl-2);
            }
            return 1+dl;
        }
        int dr = printNodesAtK(root.right, target, k);
        if(dr != -1){
            if(dr + 1 == k){
                System.out.print(root.data + " ");
            }else{
                printSubtreeNodes(root.left, k-dr-2);
            }
            return 1+dr;
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // BinaryTreeNode<Integer> root = takeTreeInput(s);
        s.close();
    }
}