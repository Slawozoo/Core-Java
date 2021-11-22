package com.clientserverchat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientUtils {
	private int port;
	private String hostName;
	private Socket socket;
	private DataInputStream din;
	private DataOutputStream dout;
	private BufferedReader br;

	public ClientUtils(int port, String hostName) {
		this.port = port;
		this.hostName = hostName;

		try {
			this.socket = new Socket(this.hostName, this.port);
			this.din = new DataInputStream(this.socket.getInputStream());

			// OutputStream outputStream = socket.getOutputStream();
			this.dout = new DataOutputStream(this.socket.getOutputStream());

			this.br = new BufferedReader(new InputStreamReader(System.in));

			String strFromServer = "", strToClient = "";
			while (!strFromServer.equals("stop")) {
				strFromServer = this.br.readLine();
				this.dout.writeUTF(strFromServer);
				this.dout.flush();
				strToClient = this.din.readUTF();
				System.out.println("Server says: " + strToClient);
			}
			socket.close();

		} catch (Exception exe) {
			exe.printStackTrace();
		}

	}

}
