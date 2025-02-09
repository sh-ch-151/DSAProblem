package com.stack.driver;

import com.stack.stk.ArrayStatckImpl;

public class ArrayStack
{
    public static void main(String[] args)
    {
        ArrayStatckImpl q = new ArrayStatckImpl();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
//        q.print();
        int ele = q.pop();
        System.out.println(ele);
       q.print();
    }
}
