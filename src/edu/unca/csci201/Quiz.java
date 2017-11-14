package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	Scanner scan = new Scanner(System.in);
	
	Question[] quizQuestions=new Question[30];
	int score;

	public void addQuestion(Question q) {
		for(int i=0;i<=quizQuestions.length;i++) {
			if(quizQuestions[i]==null) {
				quizQuestions[i]=q;
				break;
			}
		}
	}
	
	public double giveQuiz(){
		int questioncount=0;
		for(int i=0; i <= quizQuestions.length; i++){
			if(quizQuestions[i]==null) {
				System.out.println("End of Quiz");
				break;
			}
			System.out.println(quizQuestions[i].getQuestion());
			String answer = scan.nextLine();
			boolean qans=quizQuestions[i].isCorrectAnswer(answer);
			if(qans==true){
				score++;
			}
			questioncount++;
		}
		double finalScore = (score/questioncount)*100;
		
		
		return finalScore;
		
	}
	
	
}
