package com.javanetworking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramPacketReceiver {
private static final int port = 3000;
	
	
	public static int getPort() {
		return port;
	}
	
	public static void main(String []args) throws Exception {
		
		DatagramSocket dataSocket = new DatagramSocket(DatagramPacketReceiver.getPort());
		byte[] dataByte = new byte[1024];
		DatagramPacket dataPacket = new DatagramPacket(dataByte, 1024);
		
		dataSocket.receive(dataPacket);
		String str = new String(dataPacket.getData(),0, dataPacket.getLength());
		System.out.println("Data send from the sender: "+str);
		
		dataSocket.close();
	}

}
