package com.producer.consumer;

public class Main {
	public static void main(String args[])
	{
		Caller c = new Caller();
		Producer p1 = new Producer(c,1);
		Consumer c1 = new Consumer(c,1);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread (c1);
		t1.start();
		t2.start();
		
	}
}
