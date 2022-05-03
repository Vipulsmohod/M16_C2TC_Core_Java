package com.cg.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example5
{
	public static void main(String [] args)

	{

	Queue<Integer>queue=new PriorityQueue<Integer>();

	System.out.println("The removed element is:"
	+queue.poll());

	System.out.println("The head element is: "
	+queue.peek());
	}

}
