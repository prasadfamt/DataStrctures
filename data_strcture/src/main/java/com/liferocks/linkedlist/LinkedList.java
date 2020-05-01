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
        while (temp != null){
            System.out.print(temp.getValue());
            temp = temp.getNextNode();
        }
    }

    public int search(String value) {
        Node temp = this.getHead();
        boolean found = false;
        int index = 0;
        while (temp != null){
            ++index;
            if(temp.getValue().equals(value)){
                found = true;
                return index;
            }
            temp = temp.getNextNode();
        }
        if(found){
            return index;
        }else{
            return 0;
        }

    }



    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
