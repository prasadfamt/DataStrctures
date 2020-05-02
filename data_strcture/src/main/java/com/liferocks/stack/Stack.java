package com.liferocks.stack;

/**
 * Created by Prasad on 02-05-2020.
 */
public class Stack {

    private int top;

    private int maxSize;

    private int [] arr;

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Stack(int maxSize){
        this.top = -1;
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }

    public boolean isFull(){
        boolean result = false;
        if(this.top >= maxSize -1){
            result = true;
        }
        return result;
    }

    public boolean push(int value){
        boolean result = false;
        if(this.isFull()){
            return result;
        }else{
            this.arr[++this.top] = value;
            return result;
        }
    }

    public void peek(){
        if(this.top < 0){
            System.out.println("Stack is empty");
        }else{
            System.out.println(arr[this.top]);
        }
    }

    public boolean isEmpty(){
        if(this.top < 0){
            return true;
        }
        return false;
    }

    public int pop(){
        int result = Integer.MIN_VALUE;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            result = this.arr[top];
            --top;
        }

        return result;
    }

    public void display(){
        for (int i =top ; i >= 0; i--){
            System.out.print(this.arr[i]);
        }
        System.out.println("");
    }


}
