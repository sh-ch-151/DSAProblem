package com.list.driver;

import com.list.node.ListDeletion;

public class ListDelete
{
    public static void main(String[] args)
    {
        ListDeletion  list = new ListDeletion();
        list.push(1);
        list.push(2);
        list.push(3);
        list.printList();
        list.delete(2);
        list.printList();
    }
}
