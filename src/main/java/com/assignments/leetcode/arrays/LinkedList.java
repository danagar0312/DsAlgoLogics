package com.assignments.leetcode.arrays;

class LinkedList {
    Node head;

    static class Node{

        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void printList(){
        Node n = head;

        while(n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    /** Insetion in linkedlist in the starting   **/

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;

    }

    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
       3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    public void append(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;

        while(last.next != null){
            last = last.next;
        }

        last.next = new_node;
        return;

    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.head =  new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second;
        second.next = third;
        ll.printList();

        ll.append(6);

        ll.push(7);

        ll.push(1);

        ll.insertAfter(ll.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        ll.printList();


    }

}