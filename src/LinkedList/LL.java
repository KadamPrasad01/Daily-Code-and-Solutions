package LinkedList;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

    public void insert(int val , int idx){
        Node mid = new Node(val);
        Node curr = head;

        for (int i = 1; i < idx; i++) {
            curr = curr.next;
        }
        Node realNext = curr.next;
        curr.next = mid;
        mid.next = realNext;
    }

    public void deleteNode(int val){
        Node curr = head;
        if(head.val == val){
            head = head.next;
            return;
        }
        Node prev = curr;
        curr = head.next;

        // while(curr != null){
        //     if(curr.val == val){
        //         prev.next = curr.next;
        //         return;
        //     }
        //     prev = curr;
        //     curr = curr.next;
        // }

        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }



    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
