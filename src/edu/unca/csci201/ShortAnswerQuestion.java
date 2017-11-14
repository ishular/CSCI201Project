package edu.unca.csci201;

public class ShortAnswerQuestion extends SuperQuestion implements Question {

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if(qanswer==answer) {
			ans=true;
		}
		else {
			ans=false;
		}
		return ans;
	}

	@Override
	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return qanswer;
	}

}
