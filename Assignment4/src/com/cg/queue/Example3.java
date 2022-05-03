package com.cg.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example3
{
	public static void main(String [] args)

	{

	Queue<Integer>queue=new PriorityQueue<Integer>();

	queue.offer(4);

	queue.offer(8);

	queue.offer(12);

	queue.add(16);

	queue.add(20);

	System.out.println(queue);

	System.out.println("The removed element is:"
	+queue.poll());

	System.out.println(queue);

	System.out.println("The head is:" +queue.peek());

}}
