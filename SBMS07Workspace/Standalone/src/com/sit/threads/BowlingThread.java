package com.sit.threads;

public class BowlingThread extends Thread{
public void run() {
	
	for(int i=0; i<=10000; i++) {
		System.out.println("Bowling Thread :::"+i);
	}
}
}
