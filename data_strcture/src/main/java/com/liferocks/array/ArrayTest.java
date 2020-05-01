package com.liferocks.array;

/**
 * Created by Prasad on 01-05-2020.
 */
public class ArrayTest {

    public void add(char [] a, char value, int positon) throws ArrayIndexOutOfBoundsException{
        if(positon > a.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = a.length -1; i >= positon ; i--){     // 5 to 3
            a[i] = a [i-1];
        }
        a[positon -1] = value;
    }

    public void delete(char [] a, char value, int positon) throws ArrayIndexOutOfBoundsException{
        if(positon > a.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i = positon -1; i < a.length-1 ; i++){     // 3 to 5   //4 4
            a[i] = a [i+1];
        }
        a[a.length -1] = 'X';
    }

    public static void main(String[] args) throws Exception {
        ArrayTest arrayTest  = new ArrayTest();
        // char [] a = {'p', 'r', 'a', 's', 'a', ''d};
        char [] a = new char[6];
        a[0] = 'p';
        a[1] = 'r';
        a[2] = 'a';
        a[3] = 's';
        a[4] = 'a';
        a[5] = 'd';

        /** Functionality to add element at postion*/
        arrayTest.add(a, 'b',3);
        System.out.println(a);

        arrayTest.delete(a, 'b',4);
        System.out.println(a);


    }
}
