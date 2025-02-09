package com.list.node;

public class LoopDetection
{
    public static Node head;

    public LoopDetection()
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

    public boolean loopDetection()
    {Node fast, slow;
        fast = slow = head;

        if(head == null) {
            System.out.println("The list doesn't exists.");
            return false;
        }

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
