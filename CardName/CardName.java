/**
 * Cardname takes in a card shorthand in the terminal
 * and returns the value and suit of that shorthand.
 *
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
import java.util.Scanner;
import java.lang.Math;
public class CardName
{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Input card shorthand: ");
        String a = read.nextLine();
        String realSuit;
        String realValue;


        int len = a.length();
        char suit = a.charAt(len -1);
        String value = a.substring(0,len - 1);

        if (suit =='D' || suit == 'd') //single quotes for characters
            realSuit = "Diamonds";
        else if (suit == 'S' || suit == 's')
            realSuit = "Spades";
        else if (suit == 'H' || suit == 'h')
            realSuit = "Hearts";
        else if (suit == 'C' || suit == 'c')
            realSuit = "Clubs";
        else
            realSuit = "Error";
        if (value.equals("A") || value.equals("a"))
            realValue = "Ace";
        else if (value.equals("K") || value.equals("k"))
            realValue = "King";
        else if (value.equals("Q") || value.equals("q"))
            realValue = "Queen";
        else if (value.equals("J") || value.equals("j"))
            realValue = "Jack";
        else
            realValue = value;
        System.out.print("Your card is the " + realValue + " of " + realSuit);

    }
}