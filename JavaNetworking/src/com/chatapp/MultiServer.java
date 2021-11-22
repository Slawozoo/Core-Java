package com.chatapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	private int port;
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	
	@SuppressWarnings("deprecation")
	public MultiServer(int port) {
		this.port = port;
		System.out.println("Server started..");
		try {
			this.serverSocket = new ServerSocket(this.port);
			
			while(true) {
				this.clientSocket = this.serverSocket.accept();
				
				ServerWorker worker = new ServerWorker(this.clientSocket);
				worker.start();
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
