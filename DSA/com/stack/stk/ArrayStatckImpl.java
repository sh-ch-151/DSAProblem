package com.stack.stk;

public class ArrayStatckImpl
{
    int top;
    int SIZE = 5;
    int[] stack = new int[SIZE];

    public ArrayStatckImpl()
    {
        top = -1;
    }

    private boolean isEmpty()
    {
        boolean empty = false;
        if(top == -1)
        {
            empty = true;
        }
        return empty;
    }

    private boolean isFull()
    {
        boolean full = false;
        if(top > SIZE -1)
        {
            full = true;
        }
        return full;
    }

    public void push(int ele)
    {
        if(isFull())
        {
            System.out.println("Can not insert element");
        }
        else
        {
            top = top + 1;
            stack[top] = ele;
            System.out.println("Element inserted into stack");
        }
    }

    public int pop()
    {
        int ele = -1;
        if(isEmpty())
        {
            System.out.println("Can not delete element");
        }
        else
        {
            ele = stack[top];
            top--;
        }
        return ele;
    }

    public void print()
    {
        if(isEmpty())
        {
            System.out.println("Statck is empty");
        }
        else
        {
            for(int i = 0; i<= SIZE-1; i++)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
