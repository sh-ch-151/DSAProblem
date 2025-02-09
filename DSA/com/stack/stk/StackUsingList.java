package com.stack.stk;

public class StackUsingList
{
   static Node top;

    public StackUsingList()
    {
        top = null;
    }

    public void push(int key)
    {
        Node node = new Node(key);
        node.next = top;
		top = node;
        System.out.println("Inserted element into stack successfully");
    }

    public int pop()
    {
        int ele = -1;
        if(isEmpty())
        {
            System.out.println("Not able to delete element");
        }
		else
        {
	        ele = top.data;
	        top = top.next;
        }
        return ele;
    }

    public void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            while(top != null)
			{
				System.out.println(top.data);
				top = top.next;
            }
        }
    }

    private boolean isEmpty()
    {
        boolean empty = false;
        if(top == null)
        {
            empty = true;
        }
        return empty;
    }
}
