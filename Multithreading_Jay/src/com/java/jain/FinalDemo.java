package com.java.jain;

public class FinalDemo  implements Runnable{
   
	private Thread t;
	private String ThreadName;
	
	FinalDemo(String name){
		ThreadName = name;
		
	}
	
		@Override
	public synchronized void run() {
		
		System.out.println("Running :" + this.ThreadName);
		for( int i =0; i<10 ;i++)
		{
			System.out.println(this.ThreadName + "Value:" + i);
			/*try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				
			}*/
				
			
		}
	}
	
	public void start()
	{
		t = new Thread(this, ThreadName);
		System.out.println("Starting :" + this.ThreadName);
		t.start();
	}

}
