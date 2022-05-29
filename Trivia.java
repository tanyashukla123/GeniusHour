import java.util.ArrayList;

public class Trivia {
	private ArrayList<String> questions = new ArrayList<String>();
	private ArrayList<String> answers = new ArrayList<String>();
	
	public Trivia() {
		questions.add("What do you call a portable computer?");
		answers.add("laptop");
		questions.add("True or False: RAM stores information about your computer when it is closed");
		answers.add("false");
		questions.add("True or False: You need an Internet browser to go on the Internet");
		answers.add("false");
		questions.add("What is the most used search engine?");
		answers.add("google");
		questions.add("What is the lowest level of computer language?");
		answers.add("machine language");
		questions.add("What does GUI stand for?");
		answers.add("graphical user interface");
		questions.add("What is the word pixel short for?");
		answers.add("picture element");
		questions.add("What does RAM stand for?");
		answers.add("random access memory");
		questions.add("What does CPU stand for?");
		answers.add("central processing unit");
		
		
	}
	

	
	public void ask() {
		System.out.println(questions.get(0));
		questions.remove(0);
	
	}
	
	public boolean correct(String answer) {
		if(answer.equals(answers.get(0))) {
			answers.remove(0);
			return true;
		}
		else {
			answers.remove(0);
			return false;
		}
	}
	
	

}
