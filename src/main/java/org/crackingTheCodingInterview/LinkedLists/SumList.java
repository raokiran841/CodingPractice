package org.crackingTheCodingInterview.LinkedLists;

public class SumList {
    /**
     * You have two numbers represented by a linked list, where each node contains a single
     * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
     * function that adds the two numbers and returns the sum as a linked list.
     * EXAMPLE
     * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
     * Output: 2 -> 1 -> 9. That is, 912.
     ********  FOLLOW UP
     * Suppose the digits are stored in forward order. Repeat the above problem.
     * EXAMPLE
     * lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
     * Output: 9 - > 1 -> 2. That is, 912.
     * */
    public static void main(String[] args) {
        Node node1 = new Node(9).add(9).add(9).build();
        Node node2 = new Node(1).build();
        //Node.display(addList_reverse(node1, node2));
        Node.display(addList_fromFront(node1, node2));
    }

    public static Node addList_reverse(Node node1, Node node2){
        Node res = new Node(0);
        Node head = res;
        int carry = 0;
        while(node1 != null && node2 != null){
            int sum = (Integer) node1.data + (Integer) node2.data + carry;
            Node temp = new Node(sum%10);
            res.next = temp;
            res = temp;
            carry = sum/10;
            node1 = node1.next;
            node2 = node2.next;
        }
        while(node1 != null){
            int sum = (Integer)node1.data + carry;
            Node temp = new Node(sum%10);
            res.next = temp;
            res = temp;
            carry = sum/10;
            node1 = node1.next;
        }
        while(node2 != null){
            int sum = (Integer)node2.data + carry;
            Node temp = new Node(sum%10);
            res.next = temp;
            res = temp;
            carry = sum/10;
            node2 = node2.next;
        }
        if(carry > 0){
            res.next = new Node<>(carry);
        }
        return head.next;
    }

    static Node result, node1, node2, cur;
    static int carry;
    public static Node addList_fromFront(Node node1, Node node2){
        int node1Size = 0, node2Size = 0;
        Node x = node1;
        Node y = node2;
        while(x != null){
            node1Size++;
            x = x.next;
        }
        while(y != null){
            node2Size++;
            y = y.next;
        }
        int diff = Math.abs(node1Size - node2Size);
        if(diff == 0){
            recursiveAdd(node1, node2);
        } else{
            if (node1Size < node2Size) {
                Node temp = node1;
                node1 = node2;
                node2 = temp;
            }
            Node temp = node1;
            while(diff-- >= 0){
                cur = temp;
                temp = temp.next;
            }
            recursiveAdd(cur, node2);
            propagateCarry(node1);
        }
        if(carry > 0){
            Node temp = new Node(carry);
            temp.next = result;
            result = temp;
        }
        return result;
    }

    private static void propagateCarry(Node node1) {
        if(node1 != cur){
            propagateCarry(node1.next);
            int sum = (Integer) node1.data + carry;
            carry = sum/10;
            sum = sum%10;
            Node temp = new Node(sum);
            temp.next = result;
            result = temp;
        }
    }

    private static void recursiveAdd(Node node1, Node node2) {
        if(node1 == null){
            return;
        }
        recursiveAdd(node1.next, node2.next);
        int sum = (Integer) node1.data + (Integer) node2.data + carry;
        carry = sum/10;
        sum = sum%10;
        Node temp = new Node(sum);
        temp.next = result;
        result = temp;
    }
}
