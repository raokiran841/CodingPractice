package org.crackingTheCodingInterview.LinkedLists;

public class Node<T>{
    T data;
    Node next = null;

    public Node(T data){
        this.data = data;
    }

    public Node<T> add(T data){
        Node node = this;
        while(node.next != null){
            node = node.next;
        }
        node.next = new Node(data);
        return this;
    }

    public Node build(){
        return this;
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
