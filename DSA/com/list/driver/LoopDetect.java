package com.list.driver;

import com.list.node.LoopDetection;

public class LoopDetect
{
    public static void main(String[] args)
    {
        LoopDetection list = new LoopDetection();
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.head.next.next.next.next.next = list.head.next.next;
        boolean loopFound = list.loopDetection();
//        list.printList();
        System.out.println(loopFound);
    }
}
