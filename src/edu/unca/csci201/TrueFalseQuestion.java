package edu.unca.csci201;

public class TrueFalseQuestion extends SuperQuestion implements Question {

	
	public void setAnswer(String sanswer) {
		if (sanswer.equalsIgnoreCase("true")||sanswer.equalsIgnoreCase("false")){
			System.out.println("error!! wrong question format");
		}
		else {
			qanswer=sanswer;
		}
	}
	

}
