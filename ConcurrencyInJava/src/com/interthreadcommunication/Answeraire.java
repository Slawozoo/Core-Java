package com.interthreadcommunication;

public class Answeraire implements Runnable{

	Chat m;
	   //String[] s2 = { "Hi", "I am good, what about you?", "Great!" };
		String [] s2;
	   public Answeraire(Chat m2, String[] answer) {
	      this.m = m2;
	      this.s2 = answer;
	      new Thread(this, "Answer").start();
	   }

	   public void run() {

	      for (int i = 0; i < s2.length; i++) {
	         m.Answer(s2[i]);
	      }
	   }
	
}
