package algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeTraversal {

    public static void  main(String[] args){
        Node root = input();
        //levelOrder(root);
        //preOrder(root);
        inOrder(root);
    }

    //Breadth first
    private static void levelOrder(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        if(root == null){
            return;
        }

        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.data);
            if(node.left !=null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            //queue.poll();
        }
    }

    //Depth first
    private static void preOrder(Node root){
        if(root == null) return;
        System.out.println(root.data);

        preOrder(root.left);
        preOrder(root.right);
    }

    //Depth first
    private static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    private static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    private static Node input(){
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.right = new Node(7);
        root.right.left = new Node(5);
        return  root;
    }
}
