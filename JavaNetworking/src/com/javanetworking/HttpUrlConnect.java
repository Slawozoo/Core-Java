package com.javanetworking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnect {
	private static final String urlString= "https://www.linkedin.com/in/sandesh-lawaju-52a16a190/";

	public static String getUrl() {
		return urlString;
	} 

	public static void main(String []args) {
		
		try {
			URL url = new URL(HttpUrlConnect.getUrl());
			HttpURLConnection httpUrl = (HttpURLConnection)url.openConnection();
			
			for(int i=1;i<=8;i++){  
				System.out.println(httpUrl.getHeaderFieldKey(i)+" = "+httpUrl.getHeaderField(i));  
				System.out.println("Connection timeout: "+httpUrl.getConnectTimeout());
				System.out.println(httpUrl.getResponseMessage());
				}  
				httpUrl.disconnect();  
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
