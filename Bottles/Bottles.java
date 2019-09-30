
/**
 * Prints out the entirety of the song '99 bottles of beer on the wall'
 *
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public class Bottles
{
    public static void main(String[] args)
    {
        int smallBottles;
        for (int bottles = 99; bottles > 1; bottles--) {
            smallBottles = bottles - 1;
            System.out.println(bottles + " bottles of coke on the wall, " + bottles + " bottles of coke.");
            System.out.println("Take one down and pass it around, " + smallBottles + " bottles of coke on the wall,");
    }
    System.out.println("1 bottle of coke on the wall, 1 bottle of coke.");
    System.out.println("Take one down and pass it around, no more bottles of coke on the wall.");
    System.out.println("No more bottles of coke on the wall, no more bottles of coke.");
    System.out.println("Go to the store buy some more coke, 99 bottles of coke on the wall.");
    }
}