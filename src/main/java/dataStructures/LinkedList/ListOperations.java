package dataStructures.LinkedList;

 class Node {
    int data;
    Node next;
}

public class ListOperations {

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        Node node1 = new Node();
        node1.data = 2;
        head.next = node1;
        Node node2 = new Node();
        node2.data = 3;
        node1.next = node2;

        //Node node3 = Delete(head, 1);
        //System.out.println(node3.data);
        //ReversePrint(head);
        /*Node node3 = DeleteLastNode(head);
        System.out.println(node3.data);*/
       /* Node node3 = Reverse(head);
        System.out.println(node3.data);*/
        //Simple(head);
        Node node3 = ReverseIterative(head);
        Node tmp = node3;
        while(tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

    }


    private static Node Delete(Node head, int position) {
        // Complete this method

        if (position == 0) {
            return head.next;
        }
        head.next = Delete(head.next, position - 1);
        return head;

    }

    private static void ReversePrint(Node head) {

        if (head == null)
        {
            return;
        } else

        {
            ReversePrint(head.next);
            System.out.println(head.data);
        }
    }


    private static Node DeleteLastNode(Node head) {
        // Complete this method

        if (head.next == null) {
            return head.next;
        }
        head.next = DeleteLastNode(head.next);
        return head;

    }

    private static Node Reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = Reverse(head.next); // reverse all but first
        Node tmp = head.next;
        tmp.next = head;
        //head.next.next = head; // make original second point at first
        head.next = null; // make original first point at nothing

        return newHead;
    }

    private static Node ReverseIterative(Node head){
        if(head == null || head.next == null)
            return  head;

        Node curr, prev, next;
        curr= head; //428
        prev = null;
        while (curr != null) {
            next = curr.next; //429 -> 430   // 430 // null
            curr.next = prev;  // 429 -> 428 // 430 -> 429 -> 428
            prev = curr; // 429 -> 428  // 430  -> 429 -> 428
            curr = next; // 429 -> 430  // 430 // null
        }
        return prev;

    }

    private static void Simple(Node head){
        if (head == null) {
            return;
        }

        Simple(head.next);
        System.out.println(head.data);
    }
}
