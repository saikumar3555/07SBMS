package com.sit.threads;

public class BattingThread extends Thread{

	public void run() {
		
		for(int i=0; i<=10000; i++) {
			System.out.println("Batting Thread :::"+i);
		}
	}
}
