package com.biswa.dp.main.patterns;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static synchronized Singleton getInstance()  // synchronized makes it thread safe
	{
		if(instance == null)
		{
		   instance = new Singleton();
		}
		
		return instance;
	}
}

