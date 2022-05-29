import java.util.ArrayList;
import java.util.Scanner;

public class Scrabble {
    
    private ArrayList<String> words = new ArrayList<String>(); 
    private ArrayList<String> clues = new ArrayList<String>(); 
    private ArrayList<String> letters = new ArrayList<String>();

    public Scrabble()
    {
        words.add("object"); 
        letters.add("J C O T B E");
        clues.add("A member or instance of a Java class"); 

        words.add("subclass"); 
        letters.add("B C S S L U S A");
        clues.add("A class that is derived from (or extends) a super class; inherits state and behavior from its super class"); 

        words.add("overriding");
        letters.add("O R N D I V R I E G"); 
        clues.add("The process that occurs when a subclass has the same method as the parent class"); 
        
        words.add("iteration"); 
        letters.add("R I O T A E N T I"); 
        clues.add("For example, a for loop or a while loop");

        words.add("primitive"); 
        letters.add("V I M R I I T P E"); 
        clues.add("The most simple variable type in Java; for example, int, double, boolean");

        words.add("polymorphism"); 
        letters.add("M L P H P O M S I Y M"); 
        clues.add("The ability of a message to be displayed in more than one form through inheritance"); 

        words.add("autoboxing");
        letters.add("X T B G I U A O O N"); 
        clues.add("The automatic conversion that the Java compiler makes between the primitive type and their corresponding object Wrapper class");

        words.add("instance"); 
        letters.add("C I S T N E A N"); 
        clues.add("Non-static variables which are defined in a class as attributes of an object of that class"); 

        words.add("instantiate"); 
        letters.add("S N N I E I A A T T"); 
        clues.add("To allocate a memory for a declared variable; assign a value to a variable");

        words.add("methods"); 
        letters.add("T M D O E S H");  
        clues.add("A collection of statements that perform some specific task and return the result to the caller; behaviors in a class");
    }

    public int ask()
    {
        Scanner input = new Scanner(System.in); 

        int points = 0; 

        System.out.println(letters.get(0)); 
        String next = input.nextLine(); 

        if (next.equals(words.get(0)))
        {
            System.out.println("You got it! +2 points"); 
            points = 2; 
        }
        else if (next.equals("1"))
        {
            System.out.println("Your hint is: " + clues.get(0)); 
            next = input.nextLine(); 
            if (next.equals(words.get(0)))
            {
                System.out.println("You got it! +1 point"); 
                points = 1; 
            }
            else
            {
                System.out.println("Sorry, that's wrong."); 
            }
        }
        else 
        {
            System.out.println("Sorry, that's wrong."); 
        }

        letters.remove(0); 
        words.remove(0);
        clues.remove(0); 

        return points;
    }

}
