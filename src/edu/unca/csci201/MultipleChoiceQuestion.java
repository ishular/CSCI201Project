package edu.unca.csci201;


public class MultipleChoiceQuestion extends SuperQuestion implements Question {
	
	public void setAnswer(String sanswer) {
		if (sanswer.equalsIgnoreCase("a")||sanswer.equalsIgnoreCase("b")||sanswer.equalsIgnoreCase("c")||sanswer.equalsIgnoreCase("d")) {
			qanswer=sanswer;
		}
		else {
			System.out.println("error!! wrong question format");
		}
	}
	
}
	
	

	
	
