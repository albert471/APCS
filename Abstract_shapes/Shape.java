
/**
 * intro to abstract classes using shapes
 *
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public abstract class Shape
{
	private int sides;
	private int[] position = new int[2];
	
	public Shape(int s, int x, int y)
	{
		sides = s;
		position[0] = x;
		position[1] = y;
	}
	
	public int getSides()
	{
		return sides;
	}
	
	public String getLocation()
	{
		return "Shape at position (" + position[0] + "," + position[1] + ")";
	}
	
	abstract double getArea();
	
	abstract double getPerimeter();
}