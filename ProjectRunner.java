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
			System.out.println("Character 2: if you choose this character, you will have the ability to double your points for a certain minigame for one round.");
			System.out.println(" ");
			System.out.println("Character 3: if you choose this character, you will have the ability to 'double or nothing' your points for one minigame.");
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
											System.out.println("+5 points received!");
										}
									}
									else {
										System.out.println("You failed! Try again next time!");
									}
								}
								next=input.nextLine();
								if(next.equals("0")) {
									System.out.println("-----------------------------------------------------------------------------------------------------------");
									System.out.println(" ");
									System.out.println("               .odbo.\n"
											+ "           .od88888888bo.     \n"
											+ "       .od8888888888888888bo.\n"
											+ "   .od888888888888888888888888bo.\n"
											+ "od88888888888888888888888888888888bo\n"
											+ " `~888888888888888888888888888888~'\n"
											+ "    `~888888888888888888888888~'|\n"
											+ "       `~888888888888888888~'   |\n"
											+ "         |`~888888888888~'|     |\n"
											+ "         \\   `~888888~'   /     A\n"
											+ "          `-_   `~~'   _-'      H\n"
											+ "             `--____--'");
									System.out.println(" ");
									System.out.println("It's graduation day! You will be attending XXX University in the fall to pursue computer science.");
									System.out.println("Something to learn about before entering college is character abilities. At the beginning of the game, you chose a certain character type with an ability.");
									System.out.println("Type 1 had the ability to skip any trivia question. Type 2 was able to double their points for a certain minigame. Type 3 was able to go 'double or nothing' for one of the minigames");
									System.out.println("Remember your choice and consider when it's best to use it. With that, you have officially graduated Ardsley High School!");
									System.out.println(" ");
									next=input.nextLine();
									if(next.equals("0")) {
										System.out.println("-----------------------------------------------------------------------------------------------------------");
										System.out.println(" ");
										System.out.println("Welcome to XXX University!");
										next=input.nextLine();
										if(next.equals("0")) {
											System.out.println(" ");
											System.out.println("                                               /\\      /\\\n"
													+ "                                               ||______||\n"
													+ "                                               || ^  ^ ||\n"
													+ "                                               \\| |  | |/\n"
													+ "                                                |______|\n"
													+ "              __                                |  __  |\n"
													+ "             /  \\       ________________________|_/  \\_|__\n"
													+ "            / ^^ \\     /=========================/ ^^ \\===|\n"
													+ "           /  []  \\   /=========================/  []  \\==|\n"
													+ "          /________\\ /=========================/________\\=|\n"
													+ "       *  |        |/==========================|        |=|\n"
													+ "      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n"
													+ "     *****| []  [] |           _____           | []  [] | |\n"
													+ "    *******        |          /_____\\          |      * | |\n"
													+ "   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n"
													+ "  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n"
													+ " *************     |         @|__|__|@         |/ |*******|\n"
													+ "***************   ***********--=====--**********| *********\n"
													+ "***************___*********** |=====| **********|***********\n"
													+ " *************     ********* /=======\\ ******** | *********");
											System.out.println(" ");
											next=input.nextLine();
											if(next.equals("0")) {
												System.out.println("-----------------------------------------------------------------------------------------------------------");
												System.out.println("Welcome to your first class: Intro to Computer Science! This year will go by very quickly, so make sure to pay attention!");
												System.out.println(" ");
												System.out.println("               .----.\n"
														+ "      .---------. | == |\n"
														+ "      |.-\"\"\"\"\"-.| |----|\n"
														+ "      ||       || | == |\n"
														+ "      ||       || |----|\n"
														+ "      |'-.....-'| |::::|\n"
														+ "      `\"\")---(\"\"` |___.|\n"
														+ "     /:::::::::::\\\" _  \"\n"
														+ "    /:::=======:::\\`\\`\\\n"
														+ "    `\"\"\"\"\"\"\"\"\"\"\"\"\"`  '-'");
												next=input.nextLine();
												if(next.equals("0")) {
													System.out.println(" ");
													System.out.println("-----------------------------------------------------------------------------------------------------------");
													System.out.println(" __        ___     __   ___        ___  __  ___  ___  __               ___  ___  __  \n"
															+ "/  \\ |\\ | |__     /__` |__   |\\/| |__  /__`  |  |__  |__)    |     /\\   |  |__  |__) \n"
															+ "\\__/ | \\| |___    .__/ |___  |  | |___ .__/  |  |___ |  \\    |___ /~~\\  |  |___ |  \\ \n"
															+ "                                                                                      ");
													System.out.println(" ");
													System.out.println("-----------------------------------------------------------------------------------------------------------");
													next=input.nextLine();
													if(next.equals("0")) {
														System.out.println(" ");
														System.out.println("                     ______\n"
																+ "                   <((((((\\\\\\\n"
																+ "                   /      . }\\\n"
																+ "                   ;--..--._|}\n"
																+ "(\\                 '--/\\--'  )\n"
																+ " \\\\                | '-'  :'|\n"
																+ "  \\\\               . -==- .-|\n"
																+ "   \\\\               \\.__.'   \\--._\n"
																+ "   [\\\\          __.--|       //  _/'--.\n"
																+ "   \\ \\\\       .'-._ ('-----'/ __/      \\\n"
																+ "    \\ \\\\     /   __>|      | '--.       |\n"
																+ "     \\ \\\\   |   \\   |     /    /       /\n"
																+ "      \\ '\\ /     \\  |     |  _/       /\n"
																+ "       \\  \\       \\ |     | /        /\n"
																+ "        \\  \\      \\        /\n");
														System.out.println(" ");
														System.out.println("Hello class. You will now get an opportunity to earn a special internship depending on how you score on this test");
														System.out.println("Answer these two questions correctly to get the internship opportunity (+5 points too!)");
														next=input.nextLine();
														if(next.equals("0")) {
															System.out.println(" ");
															int count=0;
															System.out.println("Question 1: java is an ______ oriented programming language");
															next=input.nextLine();
															if(next.equals("object")) {
																System.out.println("+1 point! Good job!");
																points++;
																count++;
															}
															else {
																System.out.println("That's wrong. Try again on the next one!");
															}
															System.out.println(" ");
															System.out.println("Question 2: are instance variables usually private or public?");
															next=input.nextLine();
															if(next.equals("private")) {
																System.out.println("+1 point! Good job");
																points++;
																count++;
															}
															else {
																System.out.println("That's wrong. Too bad!");
															}
															System.out.println(" ");
															if(count==2) {
																System.out.println("Great job, you get the internship. Along with +5 points!");
																points+=5;
															}
															System.out.println(" ");
															next=input.nextLine();
															if(next.equals("0")) {
																System.out.println("-----------------------------------------------------------------------------------------------------------");
																System.out.println(" ");
																System.out.println(" __        ___     __   ___        ___  __  ___  ___  __               ___  ___  __  \n"
																		+ "/  \\ |\\ | |__     /__` |__   |\\/| |__  /__`  |  |__  |__)    |     /\\   |  |__  |__) \n"
																		+ "\\__/ | \\| |___    .__/ |___  |  | |___ .__/  |  |___ |  \\    |___ /~~\\  |  |___ |  \\ \n"
																		+ "                                                                                      ");
																System.out.println("-----------------------------------------------------------------------------------------------------------");
															}
															next=input.nextLine();
															if(next.equals("0")) {
																System.out.println(" ");
																System.out.println("Time for your final exam! For this exam, you will be playing another minigame: Scrabble!");
																System.out.println(" ");
															}
															next=input.nextLine();
															if(next.equals("0")) {
																System.out.println("Welcome to your second minigame... COMPUTER SCIENCE SCRABBLE!"); 
								                                
								                                System.out.println(); 

								                                System.out.println("For each question, you will be provided with a jumble of letters -- your task is to unscrabble these letters to make a computer science term."); 
								                                System.out.println("If you get it on the first try, you will recieve 2 points. If you need a hint, enter 1, and you will have the chance to guess for 1 point."); 
								                                // add in life story... college? 

								                                System.out.println(); 

								                                next = input.nextLine(); 

								                                int totalPoints = 0; 

								                                if (next.equals("0"))
								                                {
								                                    Scrabble s1 = new Scrabble(); 

								                                    for (int i = 0; i < 3; i ++)
								                                    {
								                                        totalPoints += s1.ask(); 
								                                        System.out.println("-----------------------------------------------------------------------------------------------------------"); 
								                                    }
								                                
								                                }

								                                System.out.println("You have completed your second minigame! Type 0 to see your results..."); 
								                                next = input.nextLine(); 

								                                if (next.equals("0"))
								                                {
								                                    if (totalPoints > 1)
								                                    {
								                                        System.out.println("You passed! You got at least 2/3 questions correct. Great job!");
								                                    }
								                                }
																
								                                System.out.println(" ");
								                                System.out.println("Congrats! You passed your final exam!");
															}
														
				
														}
													}
												}

											}
											
										}
										
									}
									
									

								}
							


								
							}
							
						}
					}
					
				}
			}
			

			
			
			
			
			
		}

	}

}
