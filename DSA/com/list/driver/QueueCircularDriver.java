package com.list.driver;

import com.list.node.QueueUsingCircular;

public class QueueCircularDriver
{
    public static void main(String[] args)
    {
        QueueUsingCircular queue = new QueueUsingCircular();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.print();
        int ele = queue.deQueue();
        System.out.println("My deleted element" +ele);
        System.out.println("\n\n");
        queue.print();
    }
}
