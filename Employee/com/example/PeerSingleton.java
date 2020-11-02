package com.example;

public class PeerSingleton {

	private static final PeerSingleton singleInstance = new PeerSingleton();
	
	private PeerSingleton() {}
	
	public static PeerSingleton getInstance() {
		return singleInstance;
	}

}
