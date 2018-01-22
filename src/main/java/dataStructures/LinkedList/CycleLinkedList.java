package dataStructures.LinkedList;

import java.util.LinkedList;

// find out the circled linked List
public class CycleLinkedList {

    public static void main(String[] args){
        Node root = new Node();
        root.data = 3;
        Node node1 = new Node();
        node1.data = 4;
        Node node2 = new Node();
        node2.data = 5;
        root.next= node1;
        node1.next = node2;
        System.out.println(hasCycle(root));
    }

    static boolean hasCycle(Node root){
        if(root == null) return  false;

        Node fast = root.next;
        Node slow = root;

        while(fast != null && slow != null && fast.next !=null ){
            if(fast == slow) return true;
            fast = root.next.next;
            slow = root.next;
        }
        return false;
    }
}
