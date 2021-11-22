package com.chatapp;

public class Main {

	public static void main(String[] args) {
		int port = 8086;
		
		//For single server
		new Server(port);
		
		//for multiple server
		new MultiServer(port);

	}

}
