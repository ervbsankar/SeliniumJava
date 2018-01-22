package algorithms;

import java.util.Scanner;



public class BinaryTree {

    /*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
    private static int height(Node root) {
        if (root == null) {
            return -1;
        }

        return (1 + Math.max(height(root.left), height(root.right)));

    }

    private static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int[] arr = {7, 3, 5, 2, 1, 4, 6, 7};
        for(int i : arr){
            root = insert(root,i);
        }
       /* while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }*/
        int height = height(root);
        System.out.println(height);
    }
}
