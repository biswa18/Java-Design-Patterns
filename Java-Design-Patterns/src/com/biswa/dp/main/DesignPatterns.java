package com.biswa.dp.main;

import com.biswa.dp.main.patterns.Singleton;

public class DesignPatterns {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1 + "\n" + obj2);
	}
}
