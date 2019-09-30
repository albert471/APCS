
/**
 * The card game creates a deck of 52 cards
 * and allows people to play a 'game', 
 * where player 1 and 2 each draw a card, 
 * and the computer determines which one is higher.
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;
public class Card{
    private String suit;
    private String number;
    private int y;
    public static void main(String[] args){
        String[] used = new String[52];
    int count = 0;
    
    Card c1 = new Card();
    used[count] = c1.getName();
    count ++;

    Card c2 = new Card();
    
    boolean same;
    if(c1.getName().equals(c2.getName()))
        same = true;
    else
        same = false;
    while(same){
        c2 = new Card();
        if( !c2.getName().equals(c1.getName()))
        same = false;
    }

    used[count] = c2.getName();
    count ++;

    System.out.println("Player One drew the " + c1.getName());
    System.out.println("Player Two drew the " + c2.getName());


    if(c1.getRank() > c2.getRank())
        System.out.println("Player One wins!");
    else if(c1.getRank() < c2.getRank())
        System.out.println("Player Two wins!");
    else
        System.out.println("It's a tie!");
    }
    public Card(){
        Random rand = new Random();
        int x = rand.nextInt(4);
        if(x==0){
            suit = "Clubs";
        }
        else if(x==1){
            suit = "Spades";
        }
        else if(x==2){
            suit = "Diamonds";
        }
        else if(x==3){
            suit = "Hearts";
        }
        y = rand.nextInt(13)+1;
        if(y==1){
            number = "Ace";
        }
        else if(y==11){
            number = "Jack";
        }
        else if(y==12){
            number = "Queen";
        }
        else if(y==13){
            number = "King";
        }
        else{
             number = ""+y;
    }
}
public String getName(){
    return number + " of " + suit;
}
public int getRank(){
    return y;
}
}