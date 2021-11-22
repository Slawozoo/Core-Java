package com.javanetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressExample {
	
	public static void main(String []args){
		try {
			InetAddress iNet = InetAddress.getByName("www.linkedin.com");
			
			System.out.println("Host name:"+iNet.getHostName());
			System.out.println("IP address: "+iNet.getHostAddress());
			System.out.println("Address :"+ Arrays.toString(iNet.getAddress()));
			
			
			System.out.print("\nisAnyLocalAddress : " +iNet.isAnyLocalAddress());  
			System.out.print("\nisLinkLocalAddress : " +iNet.isLinkLocalAddress());  
			System.out.print("\nisLoopbackAddress : " +iNet.isLoopbackAddress());  
			System.out.print("\nisMCGlobal : " +iNet.isMCGlobal());  
			System.out.print("\nisMCLinkLocal : " +iNet.isMCLinkLocal());  
			System.out.print("\nisMCNodeLocal : " +iNet.isMCNodeLocal());  
			System.out.print("\nisMCOrgLocal : " +iNet.isMCOrgLocal());  
			System.out.print("\nisMCSiteLocal : " +iNet.isMCSiteLocal());  
			System.out.print("\nisMulticastAddress : " +iNet.isMulticastAddress());  
			System.out.print("\nisSiteLocalAddress : " +iNet.isSiteLocalAddress());  
			System.out.print("\nhashCode : " +iNet.hashCode());  
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}

}
