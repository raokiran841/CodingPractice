package org.crackingTheCodingInterview.LinkedLists;

import java.util.HashMap;

public class RemoveDups {

    /**
     * Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     * */

    static class Node{
        int data;
        Node next = null;

        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(1);
        node.next.next = new Node(2);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(3);
        node.next.next.next.next.next = new Node(2);
        System.out.println("Before: ");
        display(node);
        removeDuplicates(node);
        System.out.println("\nAfter: ");
        display(node);
        System.out.println();
    }

    private static void display(Node node){
        while(node != null){
            System.out.print(node.data+ " -> ");
            node = node.next;
        }
    }

    private static void removeDuplicates(Node head){
        HashMap<Integer, Integer> hm = new HashMap<>();
        Node node = head;
        Node prev = head;
        while(node != null){
            if(hm.get(node.data) == null){
                hm.put(node.data, 1);
                prev = node;
            } else {
                // remove this duplicate element from LinkedList
                prev.next = node.next;
            }
            node = node.next;
        }
    }

}
