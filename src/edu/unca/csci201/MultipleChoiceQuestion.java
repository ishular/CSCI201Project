package edu.unca.csci201;


public class MultipleChoiceQuestion extends SuperQuestion implements Question {
	
	boolean ans;
	public void setAnswer(String sanswer) {
		if ((sanswer!="a")&&(sanswer!="b")&&(sanswer!="c")&&(sanswer!="d")) {
			System.out.println("error!! wrong question format");
		}
	}
	
	public String getQuestion() {
		
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
