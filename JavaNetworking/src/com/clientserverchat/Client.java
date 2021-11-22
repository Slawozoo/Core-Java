package com.clientserverchat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args)
	{
		int port = 6666;
		String hostName = "localhost";
		new ClientUtils(port, hostName);
	}
	
}
