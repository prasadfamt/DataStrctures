package com.liferocks.linkedlist;

/**
 * Created by Prasad on 01-05-2020.
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("6");
        linkedList.add("8");
        linkedList.display();

        linkedList.addAtBegining("5");
        linkedList.display();

        linkedList.add("9");
        linkedList.display();

        Node n = linkedList.search("6");
        if(n != null){
            System.out.println("Value present inside list");
        }else{
            System.out.println("Value not present");
        }

        linkedList.delete("10");
        linkedList.display();

        LinkedList deleteIntial = new LinkedList();
        deleteIntial.add("6");
        deleteIntial.delete("6");
        deleteIntial.display();

    }
}
