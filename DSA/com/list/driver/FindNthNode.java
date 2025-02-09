package com.list.driver;

import com.list.node.FindNthNodeFromEnd;

public class FindNthNode
{
    public static void main(String[] args)
    {
        FindNthNodeFromEnd list = new FindNthNodeFromEnd();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.printList();
        list.findNth(2);
    }
}
