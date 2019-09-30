
/**
 * The game of life simulates the growth of a bacteria over time. If there are too many 
 * in an area, the resources are depleted and they all die.  Similarly, if there are few
 * in a given region, then over time that area will propagate.
 *
 * @author Alberto Checcone
 * @version 1.5
 */
import java.util.Scanner;

public class Life
{

public static void main(String[] args){
        int xorig;
        int yorig;
        int iterations;
        int iterations2;
        int counter = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Number of squares across?");
        xorig = read.nextInt();
        System.out.println("Number of squares down?");
        yorig = read.nextInt();
        System.out.println("Number of iterations?");
        iterations = read.nextInt();
        iterations2 = iterations;
        Board board1= new Board(xorig,yorig);
        board1.genBoard(board1);
        board1.print();
        System.out.println();
        while(iterations > 0)
        {
        counter ++;
        iterations --;
        run(board1);
        System.out.println();
        board1.print();
        System.out.println("Iteration:" + counter + "/" + iterations2);
    }

}
public static void run(Board board1){
    Board update = new Board(board1.getXLength(),board1.getYLength());
        for(int x = 1; x<=board1.getXLength();x++){
            for(int y=1; y<=board1.getYLength();y++){
                int livecounter = board1.getPosition(x,y)*-1;
                int currentPosition = board1.getPosition(x,y);
                for(int checkx = -1; checkx <= 1; checkx++){
                        for(int checky = -1; checky <= 1; checky++){
                                if(board1.getPosition(x+checkx,y+checky) == 1)
                                {
                                    livecounter++;
                                }
                        }
                }
                if(currentPosition == 1 && livecounter <= 1){
                    update.setPosition(x,y,0);
                }
                else if(currentPosition == 1 && livecounter > 4){
                    update.setPosition(x,y,0);
                }
                else if(currentPosition == 1){
                    update.setPosition(x,y,1);
                }
                else if(currentPosition == 0 && livecounter >= 3){
                    update.setPosition(x,y,1);
                }
                else{
                    update.setPosition(x,y,0);
                }
        }
    }
    for(int x = 1; x<=board1.getXLength();x++){
            for(int y=1; y<=board1.getYLength();y++){
                board1.setPosition(x,y,update.getPosition(x,y));
            }
    }
    // Sleep for some amount of time to slow display down (from instructions)
    try
    {
        Thread.sleep(board1.getYLength()*board1.getXLength()/5+100);
    }
    catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
    }
}
}