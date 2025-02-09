package com.list.node;

public class QueueUsingCircular
{
    int SIZE = 5;
    int front, rear;
    int queue[] = new int[SIZE];
    public QueueUsingCircular()
    {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1)
            return true;
        if (front == rear + 1)
            return true;
        return false;
    }

    /* Check if the Queue is empty */
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            queue[rear] = element;
            System.out.println("Enqueue Operation Done, rear is at " + element);
        }
    }

    /* Deleting an element */
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % SIZE;
            }
            return element;
        }
    }

    int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return queue[front];
        }
    }


   public void print()
    {
        if(isEmpty())
        {
            System.out.println("Queue is full");
        }
        else
        {
            for(int idx = 0; idx < SIZE; idx++)
            {
                System.out.println(queue[idx]);
            }
        }
    }
}
