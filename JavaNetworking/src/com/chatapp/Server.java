package com.chatapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int port;
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	
	@SuppressWarnings("deprecation")
	public Server(int port) {
		this.port = port;
		System.out.println("Server started..");
		try {
			this.serverSocket = new ServerSocket(this.port);
			this.clientSocket = this.serverSocket.accept();
			this.dis = new DataInputStream(this.clientSocket.getInputStream());
			this.dos = new DataOutputStream(this.clientSocket.getOutputStream());
			
			this.dos.writeUTF("Welcome to java chat app");
			
			String message ="";
			while(!message.equals("exit")) {
				message = this.dis.readLine();
				this.dos.writeUTF("You typed: "+message);
			}
			
			this.clientSocket.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
