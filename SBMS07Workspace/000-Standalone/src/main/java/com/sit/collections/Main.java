package com.sit.collections;

public class Main {

	public static void main(String[] args) {
		 SingletonExample instance = SingletonExample.getInstance();
		 SingletonExample instance1 = SingletonExample.getInstance();
		 SingletonExample instance2 = SingletonExample.getInstance();
		 SingletonExample instance3= SingletonExample.getInstance();
		 SingletonExample instance4 = SingletonExample.getInstance();
		 System.out.println("=---"+instance.hashCode());
		 System.out.println("=---"+instance1.hashCode());
		 System.out.println("=---"+instance2.hashCode());
		 System.out.println("=---"+instance3.hashCode());
	}
}
