package com.liferocks.queue;

/**
 * Created by Prasad on 02-05-2020.
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue("Prasad");
        queue.enqueue("Pranoti");
        queue.enqueue("Pradip");
        queue.enqueue("Priya");
        queue.display();
        queue.enqueue("Pr");
        queue.dequeue();
        queue.display();

    }
}
