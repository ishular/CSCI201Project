package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		
		
	MultipleChoiceQuestion q1 = new MultipleChoiceQuestion();
	Question q2 = new TrueFalseQuestion();
	Question q3 = new ShortAnswerQuestion();
	Quiz hurray = new Quiz();
	
	q1.setQuestion("What is the Meaning of the univers \n a)2 \n b)4 \n c)24 \n d)42");
	q1.setAnswer("d");
	
	
	
	hurray.addQuestion(q1);
	System.out.println(hurray.giveQuiz());
	

}
}