package com.liferocks.linkedlist;

/**
 * Created by Prasad on 01-05-2020.
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("6");
        linkedList.add("8");
        System.out.println(linkedList);

        linkedList.addAtBegining("5");
        System.out.println(linkedList);

        linkedList.add("9");
        System.out.println(linkedList);

        System.out.println("Value found at: " + linkedList.search("0"));

        linkedList.display();


    }
}
