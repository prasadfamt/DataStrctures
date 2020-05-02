package com.liferocks.stack;

import javax.sound.midi.Soundbank;

/**
 * Created by Prasad on 02-05-2020.
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(6);
        stack.display();
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.display();
        System.out.println("isAdded: " + stack.push(10));
        stack.peek();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
    }
}
