package com.clientserverchat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUtils{

	private int port;
	private DataInputStream din;
	private ServerSocket serverSocket;
	private DataOutputStream dout;
	private BufferedReader br;

	public ServerUtils(int port) {
		this.port = port;
		try {
			this.serverSocket = new ServerSocket(this.port);

			System.out.println("Server is Waiting for client request... ");

			Socket socket = this.serverSocket.accept();
			din = new DataInputStream(socket.getInputStream());

			// OutputStream outputStream = socket.getOutputStream();
			dout = new DataOutputStream(socket.getOutputStream());

			br = new BufferedReader(new InputStreamReader(System.in));
			String strFromClient = "", strToClient = "";
			while (!strFromClient.equals("stop")) {
				strFromClient = din.readUTF();
				System.out.println("Client says: " + strFromClient);
				strToClient = br.readLine();
				dout.writeUTF(strToClient);
				dout.flush();
			}

			this.serverSocket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
