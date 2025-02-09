package com.list.driver;

import com.list.node.FinadMiddleEle;

public class FindMiddle
{
    public static void main(String[] args)
    {
        FinadMiddleEle list = new FinadMiddleEle();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.printList();
        list.findMiddle();
    }
}
