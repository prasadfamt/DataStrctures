package com.liferocks.queue;

/**
 * Created by Prasad on 02-05-2020.
 */
public class Queue {

    private int front;

    private int rear;

    private int maxSize;

    private String [] arr;

    public Queue(int maxSize){
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new String[maxSize];
    }

    public boolean isFull(){
        if(this.rear == maxSize -1){
            return true;
        }
        return false;
    }

    public boolean enqueue(String value){
        boolean result = false;
        if(isFull()){
            System.out.println("Queue is full");
            return result;
        }else{
            arr[++rear] = value;
            result = true;
        }
        return result;
    }

    public void display(){
        for (int i = front ; i <= rear; i++){
            System.out.println(this.arr[i]);
        }
    }

    public void dequeue(){
       if(front > rear){
           System.out.println("Queue is empty now");
       }else{
           ++this.front;
       }
    }


}
