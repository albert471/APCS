/** main,static method update/in main method 
 * The board class creates the checkerboard for the game of life.  
 * The main constructor creates a 20 by 20 board, but it can be overloaded
 * to create a board of any size (either square or rectangular)
 * @author Alberto Checcone
 * @version 1.0
 */
import java.util.Random;
public class Board
{
    private int[][] main;
    private int XLength;
    private int YLength;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        main = new int[22][22];
        XLength = 20;
        YLength = 20;
    }
    public Board(int size)
    {
        main = new int[size+2][size+2];
        XLength = size;
        YLength = size;
    }
    public Board(int sizex, int sizey){
        main = new int[sizey+2][sizex+2];
        XLength = sizex;
        YLength = sizey;
    }
public void genBoard(Board board)
{
    Random Rand = new Random();
    for(int x = 1; x < XLength+1;x++){
        for(int y = 1; y < YLength+1; y++){
            board.setPosition(x,y,Rand.nextInt(2));
        }
    }
    for(int x = 0; x<XLength+2; x++){
        board.setPosition(x,0,0);
    }
    for(int y = 0; y<YLength+2; y++){
        board.setPosition(0,y,0);
    }
}
public int getPosition(int x, int y){
    return main[y][x];
}
public void setPosition(int x, int y, int value){
    main[y][x] = value;
}
public int getXLength()
{
    return XLength;
}
public int getYLength()
{
    return YLength;
}
public void print()
{
    for(int y = 1;y<YLength+1;y++){
        for(int x = 1; x<XLength+1; x++){
            if(main[y][x] == 1){
               System.out.print("0");
            }
            else
                System.out.print(".");
        }
        System.out.println();
    }
}
}