package com.interthreadcommunication;

public class Questionaire implements Runnable{
	
	Chat m;
//	   String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };
	String [] s1;

	   public Questionaire(Chat m1, String[] question) {
	      this.m = m1;
	      this.s1 = question;
	      new Thread(this, "Question").start();
	   }

	   public void run() {
	   
	      for (int i = 0; i < s1.length; i++) {
	         m.Question(s1[i]);
	      }
	   }
	
}
