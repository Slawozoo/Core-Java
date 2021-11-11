package com.interthreadcommunication;

public class Chat {
	
	boolean flag = false;

	   public synchronized void Question(String msg) {

	      if (flag) {
	         
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	      System.out.println("Question: "+msg);
	      flag = true;
	      notify();
	   }

	   public synchronized void Answer(String msg) {

	      if (!flag) {
	         
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	      System.out.println("Answer: "+msg);
	      flag = false;
	      notify();
	   }
	
}
