package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void levelOrderQueue(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root == null)
            return;
        q.add(root);
        int i=0;
        while (!q.isEmpty()) {
            Node n = q.remove();
            System.out.println(i + " " + n.data);
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
            i++;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.right.right.left = new Node(40);
        root.right.right.right = new Node(30);
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        System.out.println("Breadth First Search : ");
        bfs.levelOrderQueue(root);
    }

}
