package com.list.node;

public class QueueUsinfList
{
    public Node front;
    public Node rear;
    /* defining node as null upon creation of the object. */
    public QueueUsinfList()
    {
        front = null;
        rear = null;
    }

    public void enqueue(int item) {
        Node new_node = new Node(item);
        new_node.data = item;

        if (rear == null) {
            front = rear = new_node;
            System.out.println("Enqueue Operation Done, rear is at " + rear.data);
            return;
        }

        rear.next = new_node;
        rear = new_node;
        System.out.println("Enqueue Operation Done, rear is at " + rear.data);
    }

    public int dequeue()
    {
        if (front == null)
            return -1;

        Node temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return temp.data;
    }

    int peek() {
        if (front == null)
            return -1;
        return front.data;
    }

    public void print()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            while(front != null)
            {
                System.out.println(front.data);
                front = front.next;
            }
        }
    }
}
