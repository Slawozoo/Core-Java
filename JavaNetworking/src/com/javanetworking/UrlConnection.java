package com.javanetworking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.linkedin.com/in/sandesh-lawaju-52a16a190/");
			URLConnection urlConnection = url.openConnection();
			InputStream inStream = urlConnection.getInputStream();
			int i;
			while((i= inStream.read())!=-1) {
				System.out.println((char)i);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
		
	}

}
