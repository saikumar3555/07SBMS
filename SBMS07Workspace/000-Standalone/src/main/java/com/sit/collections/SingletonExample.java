package com.sit.collections;

public class SingletonExample {

	private static SingletonExample objSingletonExample = null;
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		if(null == objSingletonExample) {
			objSingletonExample = new SingletonExample();
		}
		return objSingletonExample;
	}
}
