package com.interthreadcommunication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Chat m = new Chat();
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		System.out.print("No. of question and answer for chat: ");
		int n = sc.nextInt();
		String [] question= new String[n];
		String [] answer = new String[n];
		System.out.println("Your questions to ask: ");
		for(int i = 0; i < n; i++) {
			question[i]=scn.nextLine();
		}
		System.out.print("Answers: ");
		for(int i = 0; i < n; i++) {
			answer[i]=scn.nextLine();
		}
		
		
	      new Questionaire(m,question);
	      new Answeraire(m,answer);

	}

}
