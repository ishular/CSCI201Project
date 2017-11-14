package edu.unca.csci201;


public class MultipleChoiceQuestion extends SuperQuestion implements Question {
	
	
	public String getQuestion() {
		
		return question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if(answer.equalsIgnoreCase(qanswer)){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return qanswer;
	}
	
}
