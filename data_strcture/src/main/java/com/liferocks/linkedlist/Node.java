package com.liferocks.linkedlist;

/**
 * Created by Prasad on 01-05-2020.
 */
public class Node {

    private Node nextNode;

    private String value;

    public Node(String value){
        this.setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nextNode=" + nextNode +
                ", value='" + value + '\'' +
                '}';
    }
}
