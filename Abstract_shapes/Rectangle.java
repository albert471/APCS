
/**
 * intro to abstract classes using shapes
 *
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public class Rectangle extends Shape
{
	private final int RSIDES = 4;
	private int width;
	private int length;
	
	public Rectangle(int x, int y, int w, int l)
	{
		super(4,x,y);
		width = w;
		length = l;
	}
	
	public String toString()
	{
		String result = super.getLocation();
		result += "\n is a Rectangle with " + RSIDES + " sides.";
		return result;
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public double getPerimeter()
	{
		return length*2 + width*2;
	}

}