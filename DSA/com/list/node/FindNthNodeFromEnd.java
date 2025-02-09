package com.list.node;

public class FindNthNodeFromEnd
{
    public static Node head;
    public FindNthNodeFromEnd()
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

    public void findNth(int n)
    {
        Node prev, curr;
        prev = curr = head;
        if(head == null)
        {
            System.out.println("Empty list");
            return;
        }
        for(int i = 0; i< n; i++)
        {
            if(curr != null)
            {
                curr = curr.next;
            }
            else
            {
                System.out.println("node are not present");
                return;
            }
        }
        while(curr != null)
        {
            prev = prev.next;
            curr = curr.next;
        }
        System.out.println(prev.data);
    }
}
