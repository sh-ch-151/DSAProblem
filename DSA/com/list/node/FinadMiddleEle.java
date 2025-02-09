package com.list.node;

public class FinadMiddleEle
{
    public static Node head;
    public FinadMiddleEle()
    {
        head = null;
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

    public void printList()
    {
        Node h = head;
        while(h != null)
        {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

    public void findMiddle()
    {
        Node slow, fast;
        slow = fast= head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
