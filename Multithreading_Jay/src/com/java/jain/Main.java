package com.java.jain;

public class Main {
public static void main(String args[]){
	
	FinalDemo r1 = new FinalDemo("Thread 1");
	r1.start();
	FinalDemo r2 = new FinalDemo("Thread2");
	r2.start();
	
}
}
