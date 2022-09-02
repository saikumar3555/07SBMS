package com.sit.threads;

public class CricketMain {
public static void main(String[] args) {
	BattingThread bat= new BattingThread();
	BowlingThread bow = new BowlingThread();
	bat.start();
	bow.start();
}
}
