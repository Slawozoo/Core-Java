package com.javanetworking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DatagrampacketSender {

	private static final int port = 3000;
	
	
	public static int getPort() {
		return port;
	}


	public static void main(String []args) throws Exception {
		
			DatagramSocket dataSocket = new DatagramSocket();
			String str = "This is message sending from datagram packet using datagram socket";
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			
			DatagramPacket dataPacket = new DatagramPacket(str.getBytes() , str.length() ,ip , DatagrampacketSender.getPort());
			dataSocket.send(dataPacket);
			System.out.println("Data packet send from sender side..");
			
			dataSocket.close();
			
	}
}
