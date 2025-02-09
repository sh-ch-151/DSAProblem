package com.list.node;

public class ListInsertion
{
    public static Node head;
    public ListInsertion()
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

    public void insertAtBeg(int key)
    {
        Node temp = new Node(key);
        temp.next = head;
        head = temp;
    }

    public void insertAtLast(int key)
    {
        Node h = head;
        if(h == null)
        {
            Node temp = new Node(key);
            head.next = temp;
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

    public void inserMiddle(int key, int nodeAfter)
    {
        Node h = head;
        if(h == null)
        {
            System.out.println("We insert data when head is null");
        }
        else
        {
            while(h.data != nodeAfter)
            {
                h = h.next;
            }
            if(h == null)
            {
                System.out.println("Data not exists");
            }
            Node temp = new Node(key);
            temp.next = h.next;
            h.next = temp;
        }
    }

    public void delete(int key)
    {
        Node h = head;
        Node prev = null;
        if(h == null)
        {
            System.out.println("can not delete the data");
            return;
        }
        if(h.data == key)
        {
            head = h.next;
            return;
        }
        while(h != null && h.data != key)
        {
            prev = h;
            h = h.next;
        }
        if(h != null)
        {
            System.out.println("Data not exists");
            return;
        }
        prev.next = h.next;
    }
}
