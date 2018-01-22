package algorithms;

// Java program to print top view of Binary tree
import java.util.*;


// Driver class to test above methods
public class TopViewBinaryTree
{
    public static void main(String[] args)
    {
        /* Create following Binary Tree
             1
           /  \
          2    3
           \
            4
             \
              5
               \
                6

                */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        root.left.right.right.right.right = new Node(8);
        root.left.right.right.right.right.right = new Node(10);
        System.out.println("Following are nodes in top view of Binary Tree");
        topView(root);
    }

    static int count=0;
    private static void topView(Node root) {

        if(root == null) return;

        if(root.left != null && count>= 0 ){
            count++;
            topView(root.left);
        }

        System.out.print(root.data+ " ");
        count--;

        if(root.right!=null && count<0){
            //count--;
            topView(root.right);
        }

    }
}