package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	Scanner scan = new Scanner(System.in);
	
	Question[] quizQuestions=new Question[30];
	Question[] wrongQuestions=new Question[30];
	double score;
	double questioncount = 0;
	double finalScore=0;
	int countWQ=0;
	public void addQuestion(Question q) {
		for(int i=0;i<=quizQuestions.length;i++) {
			if(quizQuestions[i]==null) {
				quizQuestions[i]=q;
				break;
			}
		}
	}
	
	public double giveQuiz(){
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
			else {
				wrongQuestions[countWQ]=quizQuestions[i];
				countWQ++;
			}
			questioncount++;
		}
		finalScore = (score/questioncount);
		for(int l =0; l<countWQ;l++) {
			System.out.println("you Wrongly answered: "+wrongQuestions[l].getQuestion());
			System.out.println(wrongQuestions[l].getCorrectAnswer()+" Is the right Answer");
		}
		
		return (finalScore);
		
	}
	
	
}
