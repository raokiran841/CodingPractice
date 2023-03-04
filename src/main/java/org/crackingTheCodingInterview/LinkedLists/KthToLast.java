package org.crackingTheCodingInterview.LinkedLists;

public class KthToLast {
    /**
     * Implement an algorithm to find the kth to last element of a singly linked list.
     * */

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        int k = 5;

        Node res = returnKthToLastElement(node, k);
        System.out.println(res.data);
    }

    private static Node returnKthToLastElement(Node node, int k) {
        Node slow = node;
        Node head = node;
        while(node != null){
            if(k>1){ k--;}
            else{ slow = head;
            head = head.next;}
            node = node.next;
        }
        return slow;
    }
}
