package edu.unca.csci201;

import java.util.Scanner;

public class SuperQuestion {

	Scanner scan = new Scanner(System.in);
	
	String qanswer;
	String question;
	
	public void setAnswer(String sanswer){
		
		qanswer=sanswer;		
	}
	public void setQuestion(String squestion) {
		question=squestion;
	}
	public boolean isCorrectAnswer(String answer) {
		if(qanswer.equalsIgnoreCase(answer)){
			return true;
		}
		else {
			return false;
		}
	}
	public String getCorrectAnswer() {
		return qanswer;
	}
	
	public String getQuestion() {
		
		return question;
	}
	
}
