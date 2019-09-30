
/**
 * The classic RPS game as a Java exercise.
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
import java.util.Scanner;
public class RockPaperScissors
    {
        public static void main(String[] args)
        {
            String p1str;
            String p2str;;
            Scanner read = new Scanner(System.in);
            System.out.print("Player 1 Input Rock, Paper, or Scissors: ");
            p1str = read.nextLine();
            System.out.print("Player 2 Input Rock, Paper, or Scissors: ");
            p2str = read.nextLine();
            if(p1str.equalsIgnoreCase(p2str))
                System.out.print("Tie!");
            else if(p1str.equalsIgnoreCase("Rock") && p2str.equalsIgnoreCase("Scissors"))
                System.out.print("Player 1 Wins!");
            else if (p1str.equalsIgnoreCase("Paper") && p2str.equalsIgnoreCase("Rock"))
                System.out.print("Player 1 Wins!");
            else if (p1str.equalsIgnoreCase("Scissors") && p2str.equalsIgnoreCase("Paper"))
                System.out.print("Player 1 Wins!");
            else 
                System.out.print("Player 2 Wins!");
            } 
        }