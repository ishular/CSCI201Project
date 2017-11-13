package edu.unca.csci201;

import java.util.Scanner;

public class SuperQuestion {

	Scanner scan = new Scanner(System.in);
	
	String answer;
	String question;
	
	public void setAnswer(){
		
		answer=scan.nextLine();		
	}
	public void setQuestion() {
		question=scan.nextLine();
	}
}
