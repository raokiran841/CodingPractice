package org.crackingTheCodingInterview.LinkedLists;

public class DeleteMiddleNode {
    /**
     * Implement an algorithm to delete a node in the middle (i.e., any node but
     * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
     * that node.
     * EXAMPLE
     * Input: the node c from the linked list a->b->c->d->e->f
     * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
     * */
    public static void main(String[] args) {
        Node node = new Node('a').add('b').add('c').add('d').add('e').add('f').build();
        Node.display(node);
        deleteMiddleNode(node);
        node.display(node);
    }

    private static void deleteMiddleNode(Node node) {
        Node slow = node;
        Node fast = node.next;
        Node prev = null;
        while(fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
    }
}
