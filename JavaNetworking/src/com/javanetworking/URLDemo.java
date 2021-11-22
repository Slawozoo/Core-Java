package com.javanetworking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.linkedin.com/in/sandesh-lawaju-52a16a190/");
			
			System.out.println("Protocol: "+ url.getProtocol());
			System.out.println("Host name: "+url.getHost());
			System.out.println("Port Number: "+url.getPort());
			System.out.println("File path: "+url.getPath());
			System.out.println("Default port number: "+url.getDefaultPort());
			System.out.println("Query String: "+url.getQuery());
			System.out.println("Authority: "+url.getAuthority());
			
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
