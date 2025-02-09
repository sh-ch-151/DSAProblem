package com.list.driver;

import com.list.node.QueueUsinfList;

import java.util.Deque;
import java.util.LinkedList;

public class QueueList
{
    public static void main(String[] args)
    {
        QueueUsinfList q = new QueueUsinfList();
        q.enqueue(10);
        q.enqueue(20);
        int ele = q.dequeue();
        System.out.println(ele);
        q.print();
    }
}
