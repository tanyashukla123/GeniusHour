import java.util.Scanner;

public class ProjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String user=" ";
		System.out.println("Welcome to the AP CSA Game of Life");
		System.out.println("In this game, you will follow the life of a computer scientists and answer questions to progress through the years. Throughout the game you will try to accumulate more than 30 points to win and become a computer scientist!");
		System.out.println("If you are ready, type 'yes' to begin");
		user = input.nextLine();
		if(user.equals("yes")) {
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("First, choose your character out of these three options: ");
			System.out.println("Character 1: if you choose this character, you will have the ability to skip any trivia question you are unsure of, making it possible for you to progress even if you don't know the answer.");
			System.out.println(" ");
			System.out.println("Character 2: if you choose this character, you will have the ability to double your points for a certain question for one round.");
			System.out.println(" ");
			System.out.println("Character 3: if you choose this character, you will have the ability to choose the type of question you will receive for one round.");
			System.out.println(" ");
			System.out.println("Type the number of the character you want to choose. Remember, you can gain new abilities as the game goes on for one round.");
			String characterNum= " ";
			characterNum=input.nextLine();
			if(characterNum.equals("1")) {
				System.out.println("Choose a name for yourself: ");
				String name = " ";
				name = input.nextLine();
				Character1 character = new Character1(name, 17);
				Person person = new Person();
			}
			
			if(characterNum.equals("2")) {
				System.out.println("Choose a name for yourself: ");
				String name = " ";
				name = input.nextLine();
				Character2 character = new Character2(name, 17);
				Person person = new Person();
			}
			
			if(characterNum.equals("3")) {
				System.out.println("Choose a name for yourself: ");
				String name = " ";
				name = input.nextLine();
				Character3 character = new Character3(name, 17);
			}
			
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			System.out.println("It is your last day as a senior at Ardsley High School. You have dreams of becoming a computer scientist at XXX College!");
			System.out.println(" ");
			System.out.println("     Ardsley High School\n"
					+ "        ______\n"
					+ "       /      /\\\n"
					+ "    __/__/\\__/  \\___\n"
					+ "---/__|\" '' \"| /___/\\----\n"
					+ "   |''|\"'||'\"| |' '||\n"
					+ "   `\"\"`\"\"))\"\"`\"`\"\"\"\"`");
			System.out.println(" ");
			String next = " ";
			next = input.nextLine();
			if(next.equals("0")) {
				System.out.println(" ");
				System.out.println("You look towards the clock as your last high school day comes to a close");
				System.out.println(" ");
				System.out.println(".'`~~~~~~~~~~~`'.\n"
						+ "(  .'11 12 1'.  )\n"
						+ "|  :10 \\|   2:  |\n"
						+ "|  :9   @   3:  |\n"
						+ "|  :8       4;  |\n"
						+ "'. '..7 6 5..' .'\n"
						+ " ~-------------~");
				System.out.println(" ");
				System.out.println("tick...tick...tick.......");
				next=input.nextLine();
				if(next.equals("0")) {
					System.out.println(" ");
					System.out.println("and suddenly, you hear your teacher say:");
					System.out.println(" ");
					System.out.println(" |  __ \\   / __ \\  |  __ \\     / __ \\  | |  | | |_   _| |___  /\n"
							+ " | |__) | | |  | | | |__) |   | |  | | | |  | |   | |      / / \n"
							+ " |  ___/  | |  | | |  ___/    | |  | | | |  | |   | |     / /  \n"
							+ " | |      | |__| | | |        | |__| | | |__| |  _| |_   / /__ \n"
							+ " |_|       \\____/  |_|         \\___\\_\\  \\____/  |_____| /_____|\n"
							+ "                                                               \n"
							+ "                                                               ");
					next=input.nextLine();
					if(next.equals("0")) {
						System.out.println(" ");
						System.out.println("You have to pass one more quiz before you can graduate! This could make or break your career!");
						System.out.println(" ");
						next=input.nextLine();
						if(next.equals("0")) {
							System.out.println(" ");
							System.out.println("-----------------------------------------------------------------------------------------------------------");
							System.out.println("Welcome to your first minigame! These minigames will be dispersed throughout the game of life to see how you progress through life!");
							System.out.println("The first minigame will be....COMPUTER SCIENCE TRIVIA!");
							System.out.println(" ");
							System.out.println("Answer each question in lower case. Each question you get correct will allow you to earn points and progress through the game.");
							System.out.println("If you get enough questions correct, you will get to make a choice that will impact the game. If you fail, the game will progress normally.");
							System.out.println(" ");
							next=input.nextLine();
							if(next.equals("0")) {
								int points=0;
								Trivia t1 = new Trivia();
								t1.ask();
								next=input.nextLine();
								if(t1.correct(next)) {
									System.out.println("Nice job! +1 points");
									points++;
								}
								else if(!t1.correct(next)) {
									System.out.println("Sorry, that's wrong.");
								}
								System.out.println("-----------------------------------------------------------------------------------------------------------");
								t1.ask();
								next=input.nextLine();
								if(t1.correct(next)) {
									System.out.println("Nice job! +1 points");
									points++;
								}
								else if(!t1.correct(next)) {
									System.out.println("Sorry, that's wrong.");
								}
								System.out.println("-----------------------------------------------------------------------------------------------------------");
								t1.ask();
								next=input.nextLine();
								if(t1.correct(next)) {
									System.out.println("Nice job! +1 points");
									points++;
								}
								else if(!t1.correct(next)) {
									System.out.println("Sorry, that's wrong.");
								}
								System.out.println("-----------------------------------------------------------------------------------------------------------");
								System.out.println("You have completed your first minigame! Type 0 to see your results...");
								next=input.nextLine();
								if(next.equals("0")) {
									if(points>=2) {
										System.out.println("You passed! You got at least 2/3 questions correct. Good job!");
										System.out.println(" ");
										System.out.println("You now get to make a choice about your future. You get to decide if you want to take a gap year before attending college. You will be rejuvenated for college and increase your efficiency. Doing this will give you a bonus of 5 points.");
										System.out.println(" ");
										System.out.println("Type yes if you want to take a gap year and recieve 5 points.");
										next=input.nextLine();
										if(next.equals("yes")) {
											points+=5;
										}
									}
									else {
										System.out.println("You failed! Try again next time!");
									}
								}
								next=input.nextLine();
								if(next.equals("0")) {
									System.out.println("-----------------------------------------------------------------------------------------------------------");
									
								}
							


								
							}
							
						}
					}
					
				}
			}
			

			
			
			
			
			
		}

	}

}
