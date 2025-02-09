package com.list.node;

public class ListDeletion
{
    public static Node head;
    public ListDeletion()
    {
        head = null;
    }

    public void printList()
    {
        Node h = head;
        while(h != null)
        {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

    public void push(int key)
    {
        Node h = head;
        if(h == null)
        {
            Node temp = new Node(key);
            temp.next = h;
            head = temp;
        }
        else
        {
            while(h.next != null)
            {
                h = h.next;
            }
            Node temp = new Node(key);
            temp.next = h.next;
            h.next = temp;
        }
    }

    public void delete(int key) {
        Node h = head, prev = null;
        if(h == null)
        {
            System.out.println("The list is empty, the node can't be deleted.");
            return;
        }
        if(h.data == key)
        {
            head = h.next;
            return;
        }
        while (h != null && h.data != key)
        {
            prev = h;
            h = h.next;
        }
        if(h == null)
        {
            System.out.println("The key is not present in the list.");
            return;
        }
        prev.next = h.next;
    }
}
