package org.crackingTheCodingInterview.LinkedLists;

public class PartitionByX {
    /**
     * Write code to partition a linked list around a value x, such that all nodes less than x come
     * before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
     * to be after the elements less than x (see below). The partition element x can appear anywhere in the
     * "right partition"; it does not need to appear between the left and right partitions.
     * EXAMPLE
     * Input:
     * Output:
     * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
     * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
     * */
    public static void main(String[] args) {
        Node node = new Node(3).add(5).add(8).add(5).add(10).add(2).add(1).build();
        Integer x = 5;
        Node.display(node);
        node = partition(node, x);
        Node.display(node);
    }

    private static Node partition(Node node, Integer x) {
        Node res = new Node(node.data);
        Node head = res;
        Node last = res;
        Node temp = null;
        node = node.next;
        while (node != null){
            temp = new Node(node.data);
            if((Integer)node.data >= x){
                last.next = temp;
                last = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            node = node.next;
        }
        return head;
    }
}
