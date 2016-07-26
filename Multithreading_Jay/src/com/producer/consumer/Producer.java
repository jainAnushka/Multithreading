package com.producer.consumer;

public class Producer implements Runnable {
	
	private Caller c;
	private int number;
	
	Producer(Caller obj, int n){
		c = obj;
		number = n;
	}

	public void run()
	{
		for (int i=0; i<10;i++){
			c.put(i);
			System.out.println("Producer #" + number + "put value:" + i);
			/*try
			{
				wait((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		*/}
	}
}
