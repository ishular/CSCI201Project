package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
	
		MultipleChoiceQuestion MCQVec []= new MultipleChoiceQuestion[10];
		TrueFalseQuestion TFVec[] = new TrueFalseQuestion[10];
		ShortAnswerQuestion SAVec[] = new ShortAnswerQuestion[5];
	//MultipleChoiceQuestionVec[0] = new MultipleChoiceQuestion();
	
	Quiz hurray = new Quiz();
	
	MCQVec[0].setQuestion("What is the Meaning of the univers \n a)2 \n b)4 \n c)24 \n d)42");
	MCQVec[0].setAnswer("d");
	TFVec[0].setQuestion("The best wat to travel is by Blue Police box?  \n True False");
	TFVec[0].setAnswer("true");
	// need to set up an array probly three of them so that it is easer to iterate to add the question
	
	System.out.println(hurray.giveQuiz());
	

}
}