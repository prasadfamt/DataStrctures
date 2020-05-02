package com.liferocks.linkedlist;

/**
 * Created by Prasad on 01-05-2020.
 */
public class LinkedList {

    private Node head;

    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(String value) {
        Node node = new Node(value);

        /** This means list is the empty list so add this node as head and tail node*/
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            /** set tail nextNode to current node and make current node as tail node*/
            this.tail.setNextNode(node);
            this.tail = node;

        }
    }

    public void addAtBegining(String value) {
        Node node = new Node(value);
        if (this.head == null) {
            /** This is first elemtent inside list*/
            this.head = this.tail = node;
        } else {
            node.setNextNode(this.head);
            this.head = node;
        }
    }

    public void display() {
        Node temp = this.getHead();
        while (temp != null) {
            System.out.print(temp.getValue());
            temp = temp.getNextNode();
        }
        System.out.println();
    }

    public Node search(String value) {
        Node temp = this.getHead();
        Node n = null;
        int index = 0;
        while (temp != null) {
            ++index;
            if (temp.getValue().equals(value)) {
                n = temp;
            }
            temp = temp.getNextNode();
        }
        return n;
    }

    public void delete(String value) {
        Node h = this.getHead();
        Node t = this.getTail();

        if (h == null) {
            System.out.println("List is empty");
        } else {
            Node node = this.search(value);
            if (node == null) {
                System.out.println("value not present inside list");
            } else if (node == h) {
                this.head = h.getNextNode();
                node.setNextNode(null);
                if (t == node) {
                    this.tail = null;
                    System.out.println("Empty list");
                }
            } else {
                Node nodeBefore = null;
                Node temp = this.getHead();
                while (temp != null) {
                    if (temp.getNextNode() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNextNode();
                }
                if (nodeBefore != null) {
                    nodeBefore.setNextNode(node.getNextNode());
                    node.setNextNode(null);
                } else {
                    /** This case never arise just added safer side*/
                    System.out.println("Value not present inside list");
                }
            }

        }
    }
}
