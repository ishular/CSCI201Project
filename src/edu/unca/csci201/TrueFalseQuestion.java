package edu.unca.csci201;

public class TrueFalseQuestion extends SuperQuestion implements Question {

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}
	public void setAnswer(String sanswer) {
		if (sanswer!="true"||sanswer!="false") {
			System.out.println("error!! wrong question format");
		}
	}
	@Override
	public boolean isCorrectAnswer(String answer) {
		if(answer.equalsIgnoreCase(qanswer)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public String getCorrectAnswer() {
		
		return qanswer;
	}

}
