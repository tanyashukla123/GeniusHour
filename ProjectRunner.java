import java.util.Scanner;

public class ProjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String user=" ";
		System.out.println("Welcome to the AP CSA Game of Life");
		System.out.println("In this game, you will follow the life of a computer scientists and answer questions to progress through the years");
		System.out.println("If you are ready, type 'yes' to begin");
		user = input.nextLine();
		if(user.equals("yes")) {
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("First, choose your character out of these three options: ");
			System.out.println("Character 1: if you choose this character, you will have the ability to skip any question you are unsure of, making it possible for you to progress even if you don't know the answer.");
			System.out.println(" ");
			System.out.println("Character 2: if you choose this character, you will have the ability to double your points for a certain question for one round.");
			System.out.println(" ");
			System.out.println("Character 3: if you choose this character, you will have the ability to choose the type of question you will receive for one round.");
			System.out.println(" ");
			System.out.println("Type the number of the character you want to choose. Remember, you can gain new abilities as the game goes on for one round.");
			String characterNum= " ";
			characterNum=input.nextLine();
		}
		
		
		
		
		

	}

}
