package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
	
		MultipleChoiceQuestion MCQVec []= new MultipleChoiceQuestion[10];
		TrueFalseQuestion TFVec[] = new TrueFalseQuestion[10];
		ShortAnswerQuestion SAVec[] = new ShortAnswerQuestion[5];
	//MultipleChoiceQuestionVec[0] = new MultipleChoiceQuestion();
		for(int i= 0; i<10;i++) {
			 MCQVec[i]=new MultipleChoiceQuestion();
			 TFVec[i]=new TrueFalseQuestion();
			if(i<5) {
				SAVec[i]=new ShortAnswerQuestion();
			}
		}
	
	Quiz hurray = new Quiz();
	
	MCQVec[0].setQuestion("What is the Meaning of the universe? \n a)2 \n b)4 \n c)24 \n d)42");
	MCQVec[0].setAnswer("d");
	MCQVec[1].setQuestion("When playing mtg and your opponet has UU open What do you do? \n a)cry \n b)conceed \n c)plead \n d)all of the above");
	MCQVec[1].setAnswer("d");
	MCQVec[2].setQuestion("How easy is it to come up with 25 arbatrary questions? \n a)easy \n b)difficult \n c) The hardest part of the project \n d)...");
	MCQVec[2].setAnswer("c");
	MCQVec[3].setQuestion("What is the best TV show? \n a)DR.Who \n b)Star Gate \n c)Star trek \n d)I dont watch TV");
	MCQVec[3].setAnswer("a");
	MCQVec[4].setQuestion("How many spelling mistakes have I made so far? \n a)2 \n b)8 \n c)232 \n d) To many to count");
	MCQVec[4].setAnswer("d");
	MCQVec[5].setQuestion("How many more spelling mistakes will I make? \n a)10 \n b)50 \n c)100 \n d)RUNTIME ERROR");
	MCQVec[5].setAnswer("d");
	MCQVec[6].setQuestion("What is the best Movie of 2012? \n a)blah \n b)im an answer \n c)Advengers \n d)not me");
	MCQVec[6].setAnswer("c");
	MCQVec[7].setQuestion("Who is the better author? \n a)JK Rowling \n b)JR Tolkien \n c)Brandon Sanderson \n d)Stephenie Meyer");
	MCQVec[7].setAnswer("c");
	MCQVec[8].setQuestion("What is the most expensive magic card? \n a)Black Lotus \n b)Storm Crow \n c)Force of Will \n d)SnapCaster Mage");
	MCQVec[8].setAnswer("a");
	MCQVec[9].setQuestion("What was the most common answer? \n a)d \n b)a \n c)c \n d)b");
	MCQVec[9].setAnswer("a");
	
	TFVec[0].setQuestion("The best way to travel is by Blue Police box.  \n True False");
	TFVec[0].setAnswer("true");
	TFVec[1].setQuestion("Will all the true/ false questions be true. \n True False");
	TFVec[1].setAnswer("false");
	TFVec[2].setQuestion("High fantasy is the best genre.  \n True False");
	TFVec[2].setAnswer("true");
	TFVec[3].setQuestion("Zelda BOTW is 2017 game of the year.  \n True False");
	TFVec[3].setAnswer("true");
	TFVec[4].setQuestion("MTG is the best card game.  \n True False");
	TFVec[4].setAnswer("true");
	TFVec[5].setQuestion("Blue is the best color in mtg.  \n True False");
	TFVec[5].setAnswer("true");
	TFVec[6].setQuestion("No one has to read these questions.  \n True False");
	TFVec[6].setAnswer("true");
	TFVec[7].setQuestion("I am running our of ideas.  \n True False");
	TFVec[7].setAnswer("true");
	TFVec[8].setQuestion("This is the 19th question created.  \n True False");
	TFVec[8].setAnswer("true");
	TFVec[9].setQuestion("Loading Ready Run are the best internet content creators.  \n True False");
	TFVec[9].setAnswer("true");
	
	SAVec[0].setQuestion("What is the best programing Languge?");
	SAVec[0].setAnswer("java");
	SAVec[1].setQuestion("Which # is the best doctor?");
	SAVec[1].setAnswer("10");
	SAVec[2].setQuestion("Will this program compile?");
	SAVec[2].setAnswer("please");
	SAVec[3].setQuestion("What is the best month of the year?");
	SAVec[3].setAnswer("October");
	SAVec[4].setQuestion("Am I an english Major?");
	SAVec[4].setAnswer("I hope not");

	for(int j= 0; j<10;j++) {
	hurray.addQuestion(MCQVec[j]);
	hurray.addQuestion(TFVec[j]);
	if(j<5) {
		hurray.addQuestion(SAVec[j]);
	}
	}
	System.out.println("Your Score is: "+hurray.giveQuiz()+"%");
	

}
}
