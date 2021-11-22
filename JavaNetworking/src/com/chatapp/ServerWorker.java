package com.chatapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerWorker extends Thread{
		private DataInputStream dataIn;
		private DataOutputStream dataOut;
		private Socket clientSocket;
		private String message;
		
		public ServerWorker(Socket clientSocket) {
			this.clientSocket = clientSocket;
			
			
			}
		private void startWorker() {
			try{
				this.dataIn = new DataInputStream(this.clientSocket.getInputStream());
				this.dataOut = new DataOutputStream(this.clientSocket.getOutputStream());
				this.message ="";
				
				this.dataOut.writeUTF("Welcome to java chat app");
				
				while(!message.equals("exit")) {
					message = this.dataIn.readLine();
					this.dataOut.writeUTF("You typed: "+message);
				}
				
				this.clientSocket.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		public void run() {
			this.startWorker();
		}
}
