package algorithms;

import java.util.Vector;

public class BalanceBinaryTree {

    Node root;

    public static void main(String[] args) {
        BalanceBinaryTree tree = new BalanceBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(9);
        tree.root.left.left = new Node(8);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.left.left = new Node(6);
       // tree.root.left.left.left.left.left = new Node(5);

        tree.root = tree.buildTree(tree.root);
        System.out.println("Pre order travesal of Balance BST is : ");
        getPreOrder(tree.root);
    }

    private static void getPreOrder(Node root) {
        if(root == null) return;
        System.out.println(root.data +  " ");
        getPreOrder(root.left);
        getPreOrder(root.right);
    }

    private Node buildTree(Node root) {
        Vector<Node> nodes= new Vector<>();
        storeBSTNodes(root, nodes);

        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n-1);
    }

    private Node buildTreeUtil(Vector<Node> nodes, int start, int end) {

        if(start > end) return  null;
        int mid = (start + end) / 2;
        Node node = nodes.get(mid);

        node.left = buildTreeUtil(nodes,start,mid -1);
        node.right = buildTreeUtil(nodes, mid + 1, end);
        return node;
    }

    private void storeBSTNodes(Node root, Vector<Node> nodes) {
        if(root== null) return;
        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right,nodes);
    }


}
