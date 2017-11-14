package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	Scanner scan = new Scanner(System.in);
	
	Question[] quizQuestions;
	int score;
	int numQues;

	public void addQuestion(Question q) {
		quizQuestions[quizQuestions.length]=q;
	}
	
	public double giveQuiz(){
		int len = quizQuestions.length;
		for(int i=0; i <= len; i++){
			System.out.println(quizQuestions[i].getQuestion());
			String answer = scan.nextLine();
			boolean qans=quizQuestions[i].isCorrectAnswer(answer);
			if(qans==true){
				score=score + 1;
			}
			
		}
		double finalScore = (score/len)*100;
		
		
		return finalScore;
		
	}
	
	
}
