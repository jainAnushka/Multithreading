package com.producer.consumer;

public class Consumer implements Runnable{
	
	private Caller c;
	private int number;
	
	Consumer(Caller obj, int n)
	{
		c= obj;
		number = n;
	}
	
	public void run()
	{
		for (int i =0;i<10;i++)
		{
			int value = c. get();
			System.out.println("Consumer #" + number + " got value : " + value);
			/*try{
				wait((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		*/}
	}

}
