package com.list.driver;

import com.list.node.ListInsertion;
import com.list.node.Node;

public class ListInst
{
    public static void main(String[] args)
    {
        ListInsertion list = new ListInsertion();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.printList();
        System.out.println("After insert at begining");
        list.insertAtBeg(0);
        list.printList();
        System.out.println("Insert at last");
        list.insertAtLast(4);
        list.printList();
        System.out.println("Insert after");
        list.inserMiddle(5, 3);
        list.printList();
        System.out.println("List data delete");
        list.delete(3);
        list.printList();
    }
}
